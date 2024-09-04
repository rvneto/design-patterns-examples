package com.roberto.designpatterns.criacionais.factorymethod.bancodobrasil;

import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasilBoleto10Dias extends Boleto {

    public BancoDoBrasilBoleto10Dias(float valor) {
        super(valor);
        this.juros = 0.03F;
        this.desconto = 0.5F;
        this.multa = 0.02F;
    }
}
