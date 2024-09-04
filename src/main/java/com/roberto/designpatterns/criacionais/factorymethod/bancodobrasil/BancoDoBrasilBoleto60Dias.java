package com.roberto.designpatterns.criacionais.factorymethod.bancodobrasil;

import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoDoBrasilBoleto60Dias extends Boleto {

    public BancoDoBrasilBoleto60Dias(float valor) {
        super(valor);
        this.juros = 0.1F;
        this.desconto = 0F;
        this.multa = 0.15F;
    }
}
