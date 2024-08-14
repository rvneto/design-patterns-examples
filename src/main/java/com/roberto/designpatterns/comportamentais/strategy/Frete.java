package com.roberto.designpatterns.comportamentais.strategy;

import java.math.BigDecimal;

public interface Frete {

    BigDecimal calcula(BigDecimal valorPedido);

}


