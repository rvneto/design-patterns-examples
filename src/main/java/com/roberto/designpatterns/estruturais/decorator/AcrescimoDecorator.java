package com.roberto.designpatterns.estruturais.decorator;

public abstract class AcrescimoDecorator extends Pizza {

    protected Pizza pizza;

    // O decorator precisa manter uma referência ao objeto decorado
    public AcrescimoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    // Vamos forçar que cada decorador implemente sua própria descrição.
    // Para concatenar a descrição do acréscimo a descrição da pizza.
    @Override
    public abstract String getDescricao();

    // Vamos forçar que cada decorador implemente seu preço.
    // Para somar o preço do acréscimo ao preço da pizza.
    @Override
    public abstract float getPreco();
}
