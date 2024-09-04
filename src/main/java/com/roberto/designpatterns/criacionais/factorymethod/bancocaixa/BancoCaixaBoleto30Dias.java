package com.roberto.designpatterns.criacionais.factorymethod.bancocaixa;

import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixaBoleto30Dias extends Boleto {

    public BancoCaixaBoleto30Dias(float valor) {
        super(valor);
        this.juros = 0.05F;
        this.desconto = 0.05F;
        this.multa = 0.1F;
    }
}
