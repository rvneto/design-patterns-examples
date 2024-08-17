package com.roberto.designpatterns.estruturais.adapter;

import com.roberto.designpatterns.estruturais.adapter.terceiros.TopPagamentos;

import static java.util.Objects.nonNull;

public class TopPagamentosAdapter implements Gateway {

    private TopPagamentos topPagamentos;
    private String numeroCartao = null;
    private String cvv = null;

    public TopPagamentosAdapter(TopPagamentos topPagamentos) {
        this.topPagamentos = topPagamentos;
    }

    @Override
    public void setValor(float valor) {
        topPagamentos.setValorTotal(valor);
    }

    @Override
    public void setParcelas(int parcelas) {
        topPagamentos.setQuantidadeParcelas(parcelas);
    }

    @Override
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
        if (nonNull(this.cvv)) {
            topPagamentos.setCartao(this.numeroCartao, this.cvv);
        }
    }

    @Override
    public void setCvv(String cvv) {
        this.cvv = cvv;
        if (nonNull(this.numeroCartao)) {
            topPagamentos.setCartao(this.numeroCartao, this.cvv);
        }
    }

    @Override
    public boolean validarCartao() {
        return true;
    }

    @Override
    public boolean realizarPagamento() {
        return topPagamentos.realizarPagamento();
    }
}
