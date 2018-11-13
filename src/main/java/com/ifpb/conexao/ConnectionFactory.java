package com.ifpb.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/ifchannel";
        String usuario = "postgres";
        String senha = "123";

        return DriverManager.getConnection(url, usuario, senha);

    }
}
