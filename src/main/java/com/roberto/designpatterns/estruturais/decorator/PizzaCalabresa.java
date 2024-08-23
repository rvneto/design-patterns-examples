package com.roberto.designpatterns.estruturais.decorator;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa() {
        this.descricao = "Deliciosa pizza de Calabresa";
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public float getPreco() {
        return 25;
    }
}
