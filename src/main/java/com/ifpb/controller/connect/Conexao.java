package com.ifpb.controller.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public static Connection getConnection(String url, String email, String senha) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection con = null;
        con = DriverManager.getConnection(url, email, senha);
        return con;
    }
}
