package org.example.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.Producto;
import org.example.service.ListarProductosServiceLocal;

import java.io.IOException;

@WebServlet("/productos-servlet")
public class ProductosServlet extends HttpServlet {

    @EJB
    ListarProductosServiceLocal listarProductosService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Producto producto = new Producto("Galletas");
        System.out.println("Nuevo producto: "+producto);
        req.setAttribute("listado",listarProductosService.listar());
        getServletContext().getRequestDispatcher("/productos.jsp").forward(req,resp);

    }
}
