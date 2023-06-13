package org.example.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.service.CifrarServiceLocal;

import java.io.IOException;

@WebServlet("/cifrar-servlet")
public class CifrarServlet extends HttpServlet {

    @Inject
    CifrarServiceLocal cifrarServiceLocal1;

    @Inject
    CifrarServiceLocal cifrarServiceLocal2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mensaje = req.getParameter("mensajeCifrar");

        req.setAttribute("mensaje",cifrarServiceLocal1.cifrarMensaje(mensaje));

        getServletContext().getRequestDispatcher("/cifrado.jsp").forward(req,resp);


    }
}

/*
*   Ejercicio 1:
*   Usando la interfaz @Local, @RequestScope, @Stateful y @Inject
*   Crear una calculadora de números decimales a binarios.
*   Debe haber un EJB con la lógica
*   Una interfaz implementada
*   Un servlet controlador
*   Una vista que solicite el número y muestre el número cuando esté.
*
* */
