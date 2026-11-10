package com.hotella21.hotella21web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ReservaServlet", urlPatterns = {"/ReservaServlet"})
public class ReservaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String documento = request.getParameter("documento");
        String fechaIngreso = request.getParameter("fechaIngreso");
        String fechaSalida = request.getParameter("fechaSalida");
        int habitacion = Integer.parseInt(
                request.getParameter("habitacion"));

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            Connection con = Conexion.getConexion();

            // Guardar huésped
            String sqlHuesped =
                    "INSERT INTO huesped(nombre, documento) VALUES (?, ?)";

            PreparedStatement psHuesped =
                    con.prepareStatement(
                            sqlHuesped,
                            Statement.RETURN_GENERATED_KEYS);

            psHuesped.setString(1, nombre);
            psHuesped.setString(2, documento);

            psHuesped.executeUpdate();

            int idHuesped = 0;

            ResultSet rs = psHuesped.getGeneratedKeys();

            if (rs.next()) {
                idHuesped = rs.getInt(1);
            }

            // Guardar reserva
            String sqlReserva =
                    "INSERT INTO reserva VALUES (NULL, ?, ?, ?, ?, ?)";

            PreparedStatement psReserva =
                    con.prepareStatement(sqlReserva);

            psReserva.setInt(1, idHuesped);
            psReserva.setInt(2, habitacion);
            psReserva.setString(3, fechaIngreso);
            psReserva.setString(4, fechaSalida);
            psReserva.setString(5, "Activa");

            psReserva.executeUpdate();

            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Reserva Registrada</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>✅ Reserva registrada correctamente</h1>");
            out.println("<p>Huésped: " + nombre + "</p>");
            out.println("<p>Documento: " + documento + "</p>");
            out.println("<p>ID Huésped: " + idHuesped + "</p>");
            out.println("<p>Habitación: " + habitacion + "</p>");
            out.println("<p>Fecha ingreso: " + fechaIngreso + "</p>");
            out.println("<p>Fecha salida: " + fechaSalida + "</p>");

            out.println("<br>");
            out.println("<a href='principal.jsp'>Volver al inicio</a>");

            out.println("</body>");
            out.println("</html>");

            rs.close();
            psReserva.close();
            psHuesped.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}