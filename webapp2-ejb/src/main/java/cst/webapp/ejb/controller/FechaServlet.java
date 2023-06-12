package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.FechaService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/fecha-servlet")
public class FechaServlet extends HttpServlet {

    @EJB
    private FechaService fechaService1;

    @EJB
    private FechaService fechaService2;

    private int dia;
    private int mes;
    private int anio;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        dia = Integer.parseInt(req.getParameter("dia"));
        mes = Integer.parseInt(req.getParameter("mes"));
        anio = Integer.parseInt(req.getParameter("anio"));

        req.setAttribute("dias", fechaService1.contarDiasEntreHoyY(dia,mes,anio) +
                        "<br/>"+ fechaService2.contarDiasEntreHoyY(dia,mes,anio+1));
        getServletContext().getRequestDispatcher("/fecha.jsp").forward(req,resp);

    }

}

/*
*
* */
