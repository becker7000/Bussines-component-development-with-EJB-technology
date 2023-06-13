package org.example.service;

import jakarta.ejb.Local;

@Local
public interface CifrarServiceLocal {
    String cifrarMensaje(String mensaje);
}

/*
* Local es para decir que este EJB se usa dentro del
* servidor de aplicaciones,
* */
