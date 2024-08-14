package com.roberto.designpatterns.comportamentais.strategy;

import java.math.BigDecimal;

public class FreteExpresso implements Frete {

    @Override
    public float calcula(float valorPedido) {
        return (float) (valorPedido * 0.1);
    }

}
