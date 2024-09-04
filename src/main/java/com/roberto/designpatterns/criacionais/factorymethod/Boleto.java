package com.roberto.designpatterns.criacionais.factorymethod;

public abstract class Boleto {

    protected float valor;
    protected float juros;
    protected float desconto;
    protected float multa;

    public Boleto(float valor) {
        this.valor = valor;
    }

    public float calcularJuros() {
        return this.valor * this.juros;
    }

    public float calcularMulta() {
        return this.valor * this.multa;
    }

    public float calcularDesconto() {
        return this.valor * this.desconto;
    }

}
