package com.ifpb.controller.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnetion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/IFchannelVideo";
        String login = "postgres";
        String senha = "123";

        return DriverManager.getConnection(url, login, senha);
    }
}
