package com.hotella21.hotella21web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ConsultaReservasServlet")
public class ConsultaReservasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            Connection con = Conexion.getConexion();

            String sql =
                    "SELECT r.id_Reserva, h.nombre, h.documento, "
                    + "r.id_habitacion, r.fecha_ingreso, "
                    + "r.fecha_salida, r.estado_reserva "
                    + "FROM reserva r "
                    + "INNER JOIN huesped h "
                    + "ON r.id_huesped = h.idHuesped";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Consulta de Reservas</title>");

            out.println("<link rel='stylesheet' "
                    + "href='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css'>");

            out.println("</head>");

            out.println("<body class='blue lighten-5'>");

            out.println("<div class='container'>");

            out.println("<h3 class='center'>Reservas Registradas</h3>");

            out.println("<table class='highlight centered'>");

            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Huésped</th>");
            out.println("<th>Documento</th>");
            out.println("<th>Habitación</th>");
            out.println("<th>Ingreso</th>");
            out.println("<th>Salida</th>");
            out.println("<th>Estado</th>");
            out.println("</tr>");
            out.println("</thead>");

            out.println("<tbody>");

            while (rs.next()) {

                out.println("<tr>");

                out.println("<td>" + rs.getInt("id_Reserva") + "</td>");
                out.println("<td>" + rs.getString("nombre") + "</td>");
                out.println("<td>" + rs.getString("documento") + "</td>");
                out.println("<td>" + rs.getInt("id_habitacion") + "</td>");
                out.println("<td>" + rs.getString("fecha_ingreso") + "</td>");
                out.println("<td>" + rs.getString("fecha_salida") + "</td>");
                out.println("<td>" + rs.getString("estado_reserva") + "</td>");

                out.println("</tr>");
            }

            out.println("</tbody>");
            out.println("</table>");

            out.println("<br>");

            out.println("<a href='principal.jsp' "
                    + "class='btn blue'>Volver</a>");

            out.println("</div>");

            out.println("</body>");
            out.println("</html>");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}