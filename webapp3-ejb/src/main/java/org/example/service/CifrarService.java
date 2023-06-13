package org.example.service;

import jakarta.ejb.Stateful;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Stateful
public class CifrarService implements CifrarServiceLocal {

    public String cifrarMensaje(String mensaje){

        StringBuilder mensajeCifrado = new StringBuilder();

        for(int i=0;i<mensaje.length();i++){
            char otraLetra = mensaje.charAt(i);
            otraLetra+=3;
            mensajeCifrado.append(otraLetra);
        }

        return mensajeCifrado.toString();
    }

}
