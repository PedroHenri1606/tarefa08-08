package com.example.tarefa08.controller;

import com.example.tarefa08.dto.ReciboDTO;
import com.example.tarefa08.entity.Recibo;
import com.example.tarefa08.service.ReciboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/recibo")
public class ReciboController{
    @Autowired
    private ReciboService service;

    @GetMapping()
    public ResponseEntity<?> calculo(@RequestBody final ReciboDTO reciboDTO){

        Recibo recibo = service.calculo(reciboDTO.getNumeros());

        System.out.println("Média: " + recibo.getMedia());
        System.out.println("Mediana: " + recibo.getMediana());
        System.out.println("Desvio Padrão: " + recibo.getDesvioPadrao());
        System.out.println("Quantidade Recebida: " + recibo.getQuantidadeDados());

        return recibo == null
                ? ResponseEntity.badRequest().body("IXIII DOG")
                : ResponseEntity.ok(recibo);
    }
}
