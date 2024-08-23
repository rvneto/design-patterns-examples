package com.roberto.designpatterns.estruturais.decorator;

public class PizzaQueijo extends Pizza {

    public PizzaQueijo() {
        this.descricao = "Deliciosa pizza de Queijo";
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public float getPreco() {
        return 22;
    }
}
