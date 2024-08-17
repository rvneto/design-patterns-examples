package com.roberto.designpatterns.estruturais.adapter;

import lombok.Setter;

@Setter
public class Cobranca {

    private Gateway gateway;

    public Cobranca(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setValor(float valor) {
        gateway.setValor(valor);
    }

    public void setParcelas(int parcelas) {
        gateway.setParcelas(parcelas);
    }

    public void setNumeroCartao(String numeroCartao) {
        gateway.setNumeroCartao(numeroCartao);
    }

    public void setCVV(String cvv) {
        gateway.setCvv(cvv);
    }

    public boolean validarCartao() {
        return gateway.validarCartao();
    }

    public boolean realizarPagamento() {
        return gateway.realizarPagamento();
    }

}
