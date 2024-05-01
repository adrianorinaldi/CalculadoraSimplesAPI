package com.example.CalculadoraSimplesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CalculadoraController {

    @Autowired
    public CalculadoraService calculadoraService;

    @PostMapping("/somar")
    public Double somar(@RequestBody NumerosDTO numerosDTO){
        return calculadoraService.somar(numerosDTO.getPrimeiroNumero(), numerosDTO.getSegundoNumero());
    }

    @PostMapping("/subtrair")
    public Double subtrair(@RequestBody NumerosDTO numerosDTO){
        return calculadoraService.subtrair(numerosDTO.getPrimeiroNumero(), numerosDTO.getSegundoNumero());
    }

    @PostMapping("/multiplicar")
    public Double multiplicar(@RequestBody NumerosDTO numerosDTO){
        return calculadoraService.multiplicar(numerosDTO.getPrimeiroNumero(), numerosDTO.getSegundoNumero());
    }

    @PostMapping("/dividir")
    public Double dividir(@RequestBody NumerosDTO numerosDTO){
        return calculadoraService.dividir(numerosDTO.getPrimeiroNumero(), numerosDTO.getSegundoNumero());
    }
}
