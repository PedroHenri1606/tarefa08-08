package com.example.tarefa08.service;

import com.example.tarefa08.dto.ReciboDTO;
import com.example.tarefa08.entity.Recibo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReciboService {

    public Recibo recebeNumeros(final List<Double> numeros) {

        if (numeros == null || numeros.size() < 20) {
            throw new RuntimeException("A lista de números deve conter pelo menos 20 elementos.");
        }
        ReciboDTO reciboDTO = new ReciboDTO();
        reciboDTO.setNumeros(numeros);

        return new Recibo(media(numeros),desvioPadrao(numeros),numeros.size(),mediana(numeros));
    }

    public double media(List<Double> numeros) {

        double media;

        double soma = 0;
        for (Double numero : numeros) {
            soma += numero;
        }
        return media = soma / numeros.size();
    }

    public double mediana(List<Double> numeros) {

        Collections.sort(numeros);
        double mediana;
        if (numeros.size() % 2 == 0) {
            mediana = (numeros.get(numeros.size() / 2 - 1) + numeros.get(numeros.size() / 2)) / 2;
        } else {
            mediana = numeros.get(numeros.size() / 2);
        }

        return mediana;
    }

    public double desvioPadrao(List<Double> numeros){

        double somaDiferencaQuadradado = 0;
        for(Double numero : numeros){
            somaDiferencaQuadradado += Math.pow(numero - media(numeros), 2);
        }
        double desvioPadrao = Math.sqrt(somaDiferencaQuadradado / numeros.size());

        return desvioPadrao;
    }

    public double valorMenor(List<Double> numeros){
        double menorNumero;
        Collections.sort(numeros);

        return menorNumero = numeros.get(0);
    }

    public double valorMaior(List<Double> numeros){
        double menorNumero;
        Collections.sort(numeros);

        return menorNumero = numeros.get(numeros.size()-1);
    }
}
