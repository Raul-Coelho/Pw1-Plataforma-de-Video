package com.ifpb.controller.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public static Connection getConnection(String url, String email, String senha) throws SQLException, ClassNotFoundException {
        Connection con = null;
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, email, senha);
        return con;
    }
}
