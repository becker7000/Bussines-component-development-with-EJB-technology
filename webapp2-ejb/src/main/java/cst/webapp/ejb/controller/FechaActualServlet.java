package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.FechaActualService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/fecha-ahora-servlet")
public class FechaActualServlet extends HttpServlet {

    @EJB
    FechaActualService fechaActualService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("fechaActual",fechaActualService.obtenerFechaActual());
        getServletContext().getRequestDispatcher("/fecha_actual.jsp").forward(req,resp);
        getServletContext().getRequestDispatcher("/reloj_ajax.jsp").forward(req,resp);
    }
}
