package cst.webapp.ejb.service;

import jakarta.ejb.Stateless;

@Stateless
public class FibonacciService {

    public int calcularFibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }

}
