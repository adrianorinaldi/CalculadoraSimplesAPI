package com.example.CalculadoraSimplesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Double somar(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public Double subtrair(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public Double multiplicar(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    public Double dividir(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }
}
