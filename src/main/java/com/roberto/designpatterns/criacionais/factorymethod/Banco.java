package com.roberto.designpatterns.criacionais.factorymethod;

public abstract class Banco {

    public Boleto gerarBoleto(int vencimentoBoleto, float valor) {
        Boleto boleto = this.criarBoleto(vencimentoBoleto, valor);

        System.out.println("Boleto gerado com sucesso no valor de R$ " + valor);
        System.out.println("Valor de juros: R$ " + boleto.calcularJuros());
        System.out.println("Valor de multa: R$ " + boleto.calcularMulta());
        System.out.println("Valor de desconto: R$ " + boleto.calcularDesconto());
        System.out.println("---------------------");

        return boleto;

    }

    protected abstract Boleto criarBoleto(int vencimentoBoleto, float valor);

}
