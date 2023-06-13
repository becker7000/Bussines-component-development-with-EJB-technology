package org.example.service;

import jakarta.ejb.Stateful;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Stateful
public class ConversorNumService implements ConversorNumServiceLocal {

    public String convertirDecimalABinario(int decimal){

        if (decimal == 0)
            return "0";

        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            int residuo = decimal % 2;
            binario.insert(0, residuo);
            decimal /= 2;
        }

        return binario.toString();

    }


}
