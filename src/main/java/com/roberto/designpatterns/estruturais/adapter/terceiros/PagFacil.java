package com.roberto.designpatterns.estruturais.adapter.terceiros;

import lombok.Getter;
import lombok.Setter;

import static java.util.Objects.nonNull;

@Getter
@Setter
public class PagFacil {

    private float valor;
    private int parcelas;
    private String numeroCartao;
    private String cvv;

    public boolean validarCartao() {
        return nonNull(numeroCartao) && nonNull(cvv) && cvv.length() == 3;
    }

    public boolean realizarPagamento() {
        System.out.println("Pagamento realizado via PagFacil");
        return true;
    }

}
