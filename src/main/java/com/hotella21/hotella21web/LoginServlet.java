package com.hotella21.hotella21web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String correo = request.getParameter("correo");
        String password = request.getParameter("password");

        try {

            Connection con = Conexion.getConexion();

            String sql = "SELECT * FROM usuarios WHERE correo=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                response.sendRedirect("principal.jsp");

            } else {

                response.setContentType("text/html;charset=UTF-8");

                response.getWriter().println(
                        "<h1>Acceso denegado</h1>"
                        + "<p>Correo o contraseña incorrectos.</p>");

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}