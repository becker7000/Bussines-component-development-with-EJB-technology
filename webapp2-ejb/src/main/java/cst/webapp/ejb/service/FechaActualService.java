package cst.webapp.ejb.service;

import jakarta.ejb.Stateless;

import java.text.SimpleDateFormat;
import java.util.Date;

@Stateless
public class FechaActualService {

    private Date fechaActual;

    public String obtenerFechaActual(){
        fechaActual = new Date();
        // Formatear la fecha como cadena utilizando el formato "dd/MM/yyyy"
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return formato.format(fechaActual);
    }

}
