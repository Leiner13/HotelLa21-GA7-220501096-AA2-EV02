package com.hotella21.hotella21web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL =
         "jdbc:mysql://127.0.0.1:3306/hotel_la_21?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";

    private static final String PASSWORD = "Leiner13@";

    public static Connection getConexion() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Conexion exitosa");

        } catch (ClassNotFoundException | SQLException e) {

    e.printStackTrace();

    System.out.println("Error de conexion: "
            + e.getMessage());

}

        return con;
    }   
}