package com.roberto.designpatterns.estruturais.decorator;

public class MassaIntegral extends AcrescimoDecorator {

    public MassaIntegral(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        // Retorna a descrição de Pizza concatenada a descrição de MassaIntegral.
        return this.pizza.getDescricao() + " + Massa integral";
    }

    @Override
    public float getPreco() {
        // Retorna o preço de Pizza somado ao preço de MassaIntegral.
        return (float) (this.pizza.getPreco() + 5);
    }
}
