package com.roberto.designpatterns.estruturais.facade.vendas;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(Pedido pedido) {
        super(pedido);
    }

    @Override
    public boolean realizarPagamento() {
        return this.pedido.getValor() > 0;
    }

}
