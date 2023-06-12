package cst.webapp.ejb.service;

import jakarta.ejb.Stateless;

@Stateless
public class HolaService {

    private int contador;

    public String saludar(String nombre){
        // Imprimir debe ir antes que el return.
        contador++;
        System.out.println("HC: "+this);
        return "Hola "+nombre+" desde un EJB";
    }

}
