package org.example.service;

import jakarta.ejb.Stateful;
import jakarta.enterprise.context.RequestScoped;

//@RequestScoped
@Stateful
public class HolaRequestScopeService {

    private int contador;

    public String mensaje(){
        contador++;
        return "Hola en request scope: "+this+" contador: "+contador;
    }

}

// TODO: hacer otro EJB para @RequestScope e @Injection
