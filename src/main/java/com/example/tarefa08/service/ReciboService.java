package com.example.tarefa08.service;

import com.example.tarefa08.entity.Recibo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ReciboService {

    public Recibo calculo(final List<Double> numeros){

        if (numeros == null || numeros.size() < 20) {
            throw new ("A lista de números deve conter pelo menos 20 elementos.");
        }

        Recibo recibo = new Recibo();

        double soma = 0;
        for (Double numero : numeros){
            soma += numero;
        }

        double media = soma / numeros.size();
        recibo.setMedia(media);

        Collections.sort(numeros);
        double mediana;
        if(numeros.size() % 2 == 0){
            mediana = (numeros.get(numeros.size() / 2 - 1) + numeros.get(numeros.size() / 2)) /2;
        } else {
            mediana = numeros.get(numeros.size() /2);
        }

        recibo.setMediana(mediana);

        double somaDiferencaQuadradado = 0;
        for(Double numero : numeros){
            somaDiferencaQuadradado += Math.pow(numero - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaDiferencaQuadradado / numeros.size());

        recibo.setDesvioPadrao(desvioPadrao);
        recibo.setQuantidadeDados(numeros.size());

        return recibo;


    }
}
