package com.roberto.designpatterns.criacionais.factorymethod.bancodobrasil;

import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasilBoleto30Dias extends Boleto {

    public BancoDoBrasilBoleto30Dias(float valor) {
        super(valor);
        this.juros = 0.05F;
        this.desconto = 0.02F;
        this.multa = 0.5F;
    }
}
