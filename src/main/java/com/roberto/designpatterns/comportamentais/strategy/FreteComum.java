package com.roberto.designpatterns.comportamentais.strategy;

import java.math.BigDecimal;

public class FreteComum implements Frete {

    @Override
    public float calcula(float valorPedido) {
        return (float) (valorPedido * 0.05);
    }

}
