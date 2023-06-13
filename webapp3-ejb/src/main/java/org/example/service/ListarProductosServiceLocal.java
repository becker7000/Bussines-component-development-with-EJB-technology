package org.example.service;

import jakarta.ejb.Local;
import org.example.model.Producto;

import java.util.List;

@Local
public interface ListarProductosServiceLocal {

     List<Producto> listar();
     Producto crearProducto(Producto producto);

}
