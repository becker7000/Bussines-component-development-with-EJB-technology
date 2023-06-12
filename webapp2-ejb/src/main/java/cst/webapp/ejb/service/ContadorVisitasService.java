package cst.webapp.ejb.service;

import jakarta.ejb.Stateful;

@Stateful
public class ContadorVisitasService {

    private int contadorVisitas;

    public String obtenerContadorVisitas(){
        contadorVisitas++;
        System.out.println("Visitas: "+contadorVisitas);
        return "Esta página ha sido visitada "+contadorVisitas+" veces.";
    }

}
