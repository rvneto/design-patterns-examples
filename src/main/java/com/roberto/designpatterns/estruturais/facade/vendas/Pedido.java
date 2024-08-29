package com.roberto.designpatterns.estruturais.facade.vendas;

import com.roberto.designpatterns.estruturais.facade.Consumidor;
import com.roberto.designpatterns.estruturais.facade.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pedido {

    private Consumidor consumidor;
    private List<Produto> produtos = new ArrayList<>();
    private float valor = 0;

    public Pedido(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
        this.valor += produto.getValor();
    }

}
