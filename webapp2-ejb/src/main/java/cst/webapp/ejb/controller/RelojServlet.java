package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.FechaActualService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/reloj-servlet")
public class RelojServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    FechaActualService fechaActualService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(fechaActualService.obtenerFechaActual());
        out.flush();
    }
}
