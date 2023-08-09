package com.example.tarefa08.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Recibo {

    @Getter @Setter
    private Double media;

    @Getter @Setter
    private Double desvioPadrao;

    @Getter @Setter
    private Integer quantidadeDados;

    @Getter @Setter
    private Double mediana;
}
