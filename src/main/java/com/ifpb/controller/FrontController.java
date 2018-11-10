package com.ifpb.controller;

import com.ifpb.model.Usuario;
import com.ifpb.model.UsuarioDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastrar")

public class FrontController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UsuarioDAO dao = new UsuarioDAO();


        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String sexo = request.getParameter("sexo");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String cep = request.getParameter("cep");
        String telefone = request.getParameter("telefone");
        String foto = request.getParameter("foto");

        request.setAttribute("nome", nome);
        request.setAttribute("email", email);
        request.setAttribute("senha", senha);
        request.setAttribute("sexo", sexo);
        request.setAttribute("rua", rua);
        request.setAttribute("numero", numero);
        request.setAttribute("cidade", cidade);
        request.setAttribute("estado", estado);
        request.setAttribute("cep", cep);
        request.setAttribute("telefone", telefone);
        request.setAttribute("foto", foto);

        dao.salvar(new Usuario(email,senha,nome,sexo,foto,rua,cidade,estado,cep,telefone,numero));

        request.getRequestDispatcher("nome.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            UsuarioDAO dao = new UsuarioDAO();

            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String sexo = request.getParameter("sexo");
            String rua = request.getParameter("rua");
            String numero = request.getParameter("numero");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("estado");
            String cep = request.getParameter("cep");
            String telefone = request.getParameter("telefone");
            String foto = request.getParameter("foto");

            request.setAttribute("nome", nome);
            request.setAttribute("email", email);
            request.setAttribute("senha", senha);
            request.setAttribute("sexo", sexo);
            request.setAttribute("rua", rua);
            request.setAttribute("numero", numero);
            request.setAttribute("cidade", cidade);
            request.setAttribute("estado", estado);
            request.setAttribute("cep", cep);
            request.setAttribute("telefone", telefone);
            request.setAttribute("foto", foto);

            dao.salvar(new Usuario(email, senha, nome, sexo, foto, rua, cidade, estado, cep, telefone, numero));

            request.getRequestDispatcher("nome.jsp").forward(request, response);

            response.addHeader("Content-type", "text/html");

            response.getWriter().append("Recebido via POST");
            response.getWriter().append("<h1>Olá " + nome + "</h1>");
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
