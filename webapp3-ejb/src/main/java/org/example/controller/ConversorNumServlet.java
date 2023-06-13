package org.example.controller;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.service.ConversorNumServiceLocal;

import java.io.IOException;

@WebServlet("/conversor-num-servlet")
public class ConversorNumServlet extends HttpServlet {

    @Inject
    ConversorNumServiceLocal conversorNumServiceLocal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int decimal = Integer.parseInt(req.getParameter("decimal"));

        String binario = conversorNumServiceLocal.convertirDecimalABinario(decimal);
        req.setAttribute("respuesta","El número decimal "+decimal+" en binario es: "+binario);

        getServletContext().getRequestDispatcher("/binario.jsp").forward(req,resp);

    }

}

/*
*   Ejercicio: crear un jsp que pida un número entero entre 1 y 3999
*              entonces envié el numero a un controlador para que sea
*              transformado a romano, el controlador hará uso de un EJB
*              a través de una interfaz implementada.
* */