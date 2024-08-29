package com.roberto.designpatterns.estruturais.facade.vendas;

public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(Pedido pedido) {
        super(pedido);
    }

    @Override
    public boolean realizarPagamento() {
        return this.pedido.getValor() > 0;
    }

}
