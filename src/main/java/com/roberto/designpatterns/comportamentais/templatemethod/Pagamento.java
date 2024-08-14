package com.roberto.designpatterns.comportamentais.templatemethod;

public abstract class Pagamento {

    protected float valor;
    protected Gateway gateway;

    public Pagamento(float valor, Gateway gateway) {
        this.valor = valor;
        this.gateway = gateway;
    }

    public abstract float calcularDesconto(float valor);

    public float calcularTaxa(float valor) {
        return 0;
    }

    // Esse é o template method
    public boolean realizarCobranca(float valor) {
        System.out.println(valor + " + " + calcularTaxa(valor) + " - " + calcularDesconto(valor));
        float valorFinal = valor + calcularTaxa(valor) - calcularDesconto(valor);
        return gateway.cobrar(valorFinal);
    }

}
