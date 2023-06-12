package cst.webapp.ejb.service;

import jakarta.ejb.Stateful;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Stateful
public class FechaService {

    private LocalDate fechaInicial;
    private LocalDate fechaFinal;

    public String contarDiasEntreHoyY(int dia,int mes,int anio){
        fechaInicial = LocalDate.now();
        fechaFinal = LocalDate.of(anio,mes,dia);
        int dias =(int)ChronoUnit.DAYS.between(fechaInicial,fechaFinal);
        System.out.println("Fecha HC: "+this);
        return "Los dias entre "+fechaInicial+" y "+fechaFinal+" son: "+dias;
    }

}
