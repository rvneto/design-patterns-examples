package com.roberto.designpatterns.comportamentais.strategy;

import java.math.BigDecimal;

public class FreteExpresso implements Frete {

    @Override
    public BigDecimal calcula(BigDecimal valorPedido) {
        return valorPedido.multiply(new BigDecimal("0.1"));
    }

}
