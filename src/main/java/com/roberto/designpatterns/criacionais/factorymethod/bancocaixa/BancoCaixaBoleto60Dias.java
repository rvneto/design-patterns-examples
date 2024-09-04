package com.roberto.designpatterns.criacionais.factorymethod.bancocaixa;

import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixaBoleto60Dias extends Boleto {

    public BancoCaixaBoleto60Dias(float valor) {
        super(valor);
        this.juros = 0.1F;
        this.desconto = 0F;
        this.multa = 0.2F;
    }
}
