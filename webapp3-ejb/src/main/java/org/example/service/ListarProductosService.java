package org.example.service;

import jakarta.ejb.Stateless;
import org.example.model.Producto;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class ListarProductosService implements ListarProductosServiceLocal {


    @Override
    public List<Producto> listar() {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Jugo"));
        productos.add(new Producto("Chocolate"));
        productos.add(new Producto("Agua"));
        System.out.println("Listando productos.");
        return productos;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        System.out.println("Creando producto.");
        Producto producto1 = new Producto();
        producto1.setNombre(producto.getNombre());
        return producto1;
    }
    /*
    * Si trabajamos con persistencia de datos
    * estos metodos estarían envueltos en una transacción.
    * Es decir, son transaccionales.
    * */

}
