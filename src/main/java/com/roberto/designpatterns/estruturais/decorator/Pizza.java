package com.roberto.designpatterns.estruturais.decorator;

public abstract class Pizza {

    protected String descricao = "Descrição não definida";
    protected float preco;

    public abstract String getDescricao();

    public abstract float getPreco();

}
