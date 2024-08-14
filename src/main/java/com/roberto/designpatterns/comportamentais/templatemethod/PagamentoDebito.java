package com.roberto.designpatterns.comportamentais.templatemethod;

public class PagamentoDebito extends Pagamento {

    public PagamentoDebito(float valor, Gateway gateway) {
        super(valor, gateway);
    }

    @Override
    public float calcularTaxa(float valor) {
        return 4;
    }

    @Override
    public float calcularDesconto(float valor) {
        return (float) (valor * 0.05);
    }
}
