package com.ifpb.view;

import com.ifpb.model.dao.UsuarioDAO;
import com.ifpb.model.entidades.Usuario;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println(dao.salvar(new Usuario(0,"lucas1", "321","Lucas","M","",
                "Fon","1","PB","5890000","889999000","102")));
    }
}
