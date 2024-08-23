package com.roberto.designpatterns.estruturais.decorator;

public class BordaRequeijao extends AcrescimoDecorator {

    public BordaRequeijao(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        // Retorna a descrição de Pizza concatenada a descrição de BordaRequeijao.
        return this.pizza.getDescricao() + " + Borda recheada de requeijão";
    }

    @Override
    public float getPreco() {
        // Retorna o preço de Pizza somado ao preço de BordaRequeijao.
        return (float) (this.pizza.getPreco() + 8.5);
    }
}
