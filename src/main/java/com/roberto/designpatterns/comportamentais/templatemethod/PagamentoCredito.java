package com.roberto.designpatterns.comportamentais.templatemethod;

public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(float valor, Gateway gateway) {
        super(valor, gateway);
    }

    @Override
    public float calcularTaxa(float valor) {
        return (float) (valor * 0.05);
    }

    @Override
    public float calcularDesconto(float valor) {
        if (valor > 300) {
            return (float) (valor * 0.02);
        }
        return 0;
    }
}
