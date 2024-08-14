package com.roberto.designpatterns.comportamentais.strategy;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Pedido {

    private BigDecimal valor;
    private Frete tipoFrete;

    public BigDecimal calculaFrete() {
        return tipoFrete.calcula(valor);
    }

}
