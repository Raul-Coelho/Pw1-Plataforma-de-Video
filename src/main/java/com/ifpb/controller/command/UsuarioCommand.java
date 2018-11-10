package com.ifpb.controller.command;

import com.ifpb.model.Usuario;
import com.ifpb.model.UsuarioDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UsuarioCommand implements Command {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UsuarioDAO dao = new UsuarioDAO();

        List<Usuario> usuarios = dao.listar();

    }
}
