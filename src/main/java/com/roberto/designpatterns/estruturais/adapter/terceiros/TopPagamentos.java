package com.roberto.designpatterns.estruturais.adapter.terceiros;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TopPagamentos {

    @Setter
    private float valorTotal;
    @Setter
    private int quantidadeParcelas;
    private String numeroCartao;
    private String cvv;

    public void setCartao(String numeroCartao, String cvv){
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
    }


    public boolean realizarPagamento() {
        System.out.println("Pagamento realizado via TopPagamentos");
        return true;
    }

}
