package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.HolaService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hola-servlet")
public class HolaServlet extends HttpServlet {

    @EJB
    private HolaService holaService;

    @EJB
    private HolaService holaService2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("El servicio 1 es igual al servicio 2? => "+holaService.equals(holaService2));
        req.setAttribute("saludo",holaService.saludar("Erick"));
        req.setAttribute("saludo2",holaService.saludar("James Gosling"));
        getServletContext().getRequestDispatcher("/hola.jsp").forward(req,resp);

    }

}

/*
*   25 minutos
*   Ejercicio: hacer un EJB desde cero que imprima en pantalla la fecha
*   del día de hoy. Hint: usar la clase Date, crear un Servlet controlador
*   y una vista en jsp, ligar el servlet en el menú del index.html
* */