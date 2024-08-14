package com.roberto.designpatterns.comportamentais.templatemethod;

public class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(float valor, Gateway gateway) {
        super(valor, gateway);
    }

    @Override
    public float calcularDesconto(float valor) {
        return (float) (valor * 0.1);
    }
}
