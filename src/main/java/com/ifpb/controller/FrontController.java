package com.ifpb.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/inicio")

public class FrontController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");

        request.setAttribute("nome", nome);

        request.getRequestDispatcher("nome.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nome = request.getParameter("nome");

        response.addHeader("Content-type", "text/html");

        response.getWriter().append("Recebido via POST");
        response.getWriter().append("<h1>Olá "+nome+"</h1>");

    }
}
