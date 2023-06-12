package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.FibonacciService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/fibonacci-servlet")
public class FibonacciServlet extends HttpServlet {

    @EJB
    private FibonacciService fibonacciService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("numero"));
        List<Integer> sucesion = generarSucesionFibonacci(numero);
        request.setAttribute("sucesion", sucesion);
        request.getRequestDispatcher("fibonacci.jsp").forward(request, response);
    }

    private List<Integer> generarSucesionFibonacci(int numero) {
        List<Integer> sucesion = new ArrayList<>();
        for (int i = 0; i <= numero; i++) {
            int valor = fibonacciService.calcularFibonacci(i);
            sucesion.add(valor);
        }
        return sucesion;
    }
}

/*
*   25 minutos
*   Crear un EJB que permita calcular el área de un círculo.
*   Solicitar el radio a través de un jsp y luego controlar el resultado
*   con un servlet, enviar el resultado a la misma vista jsp.
* */

