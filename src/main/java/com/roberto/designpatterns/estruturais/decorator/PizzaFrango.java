package com.roberto.designpatterns.estruturais.decorator;

public class PizzaFrango extends Pizza {

    public PizzaFrango() {
        this.descricao = "Deliciosa pizza de Frango";
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public float getPreco() {
        return 19;
    }
}
