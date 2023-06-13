package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.service.HolaRequestScopeService;

import javax.naming.InitialContext;
import java.io.IOException;

@WebServlet("/hola-uno-servlet")
public class HolaUnoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HolaRequestScopeService holaService1 = null;
        HolaRequestScopeService holaService2 = null;

        try{
            InitialContext contexto = new InitialContext();
            holaService1 = (HolaRequestScopeService) contexto.lookup("java:global/webapp3-ejb/HolaRequestScopeService!org.example.service.HolaRequestScopeService");
            holaService2 = (HolaRequestScopeService) contexto.lookup("java:global/webapp3-ejb/HolaRequestScopeService!org.example.service.HolaRequestScopeService");

        }catch (Exception exception){
            System.out.println("Error: "+exception.getMessage());
        }

        req.setAttribute("mensaje1",holaService1.mensaje());
        req.setAttribute("mensaje2",holaService2.mensaje());

        getServletContext().getRequestDispatcher("/hola_jndi.jsp").forward(req,resp);

    }
}
