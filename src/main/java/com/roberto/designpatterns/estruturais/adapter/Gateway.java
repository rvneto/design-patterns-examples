package com.roberto.designpatterns.estruturais.adapter;

public interface Gateway {

    void setValor(float valor);

    void setParcelas(int parcelas);

    void setNumeroCartao(String numeroCartao);

    void setCvv(String cvv);

    boolean validarCartao();

    boolean realizarPagamento();

}
