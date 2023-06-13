package org.example.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.service.HolaRequestScopeService;

import java.io.IOException;

@WebServlet("/hola-rs-servlet")
public class HolaRequestScopeServlet extends HttpServlet {

    @Inject
    HolaRequestScopeService holaRS1;

    @Inject
    HolaRequestScopeService holaRS2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("mensaje1",holaRS1.mensaje());
        req.setAttribute("mensaje2",holaRS2.mensaje());

        getServletContext().getRequestDispatcher("/hola_rs.jsp").forward(req,resp);

    }
}
