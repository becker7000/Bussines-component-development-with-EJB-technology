package cst.webapp.ejb.service;

import jakarta.ejb.Stateless;

@Stateless
public class AreaCirculoService {

    public String calcularArea(double radio){
        double area = Math.PI*Math.pow(radio,2);
        return String.format("El área de un círculo con radio %.2f es: %.4f",radio,area);
    }

}
