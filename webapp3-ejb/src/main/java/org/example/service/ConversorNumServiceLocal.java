package org.example.service;

import jakarta.ejb.Local;

@Local
public interface ConversorNumServiceLocal {

    String convertirDecimalABinario(int decimal);

}
