package com.roberto.designpatterns.criacionais.factorymethod.bancocaixa;

import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixaBoleto10Dias extends Boleto {

    public BancoCaixaBoleto10Dias(float valor) {
        super(valor);
        this.juros = 0.02F;
        this.desconto = 0.1F;
        this.multa = 0.05F;
    }
}
