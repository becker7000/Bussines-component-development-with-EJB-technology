package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.ContadorVisitasService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/contador-visitas-servlet")
public class ContadorVisitasServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    ContadorVisitasService contadorVisitasService;

    String contador;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        contador = contadorVisitasService.obtenerContadorVisitas();

        if (contador != null) {
            req.setAttribute("contador", contador);
        } else {
            // Manejo de caso cuando el contador es null
            req.setAttribute("contador", "Error al obtener el contador de visitas");
        }

        System.out.println(contador);
        getServletContext().getRequestDispatcher("/contador_visitas.jsp").forward(req,resp);

    }
}
