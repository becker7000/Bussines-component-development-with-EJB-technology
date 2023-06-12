package cst.webapp.ejb.controller;

import cst.webapp.ejb.service.AreaCirculoService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/area-circulo-servlet")
public class AreaCirculoServlet extends HttpServlet {

    @EJB
    AreaCirculoService areaCirculoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double radio = Double.parseDouble(req.getParameter("radio"));

        req.setAttribute("area",areaCirculoService.calcularArea(radio));
        getServletContext().getRequestDispatcher("/circulo.jsp").forward(req,resp);

    }
}
