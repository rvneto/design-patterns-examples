package com.roberto.designpatterns.comportamentais.strategy;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Pedido {

    private float valor;
    private Frete tipoFrete;

    public float calculaFrete() {
        return tipoFrete.calcula(valor);
    }

}
