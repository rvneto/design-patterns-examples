package com.roberto.designpatterns.estruturais.facade;

import com.roberto.designpatterns.estruturais.facade.vendas.*;

public class VendaFacade {

    private Pedido pedido;
    private Pagamento pagamento;
    private EmailPedido email;

    public VendaFacade(Consumidor consumidor) {
        this.pedido = new Pedido(consumidor);
        this.email = new EmailPedido(this.pedido);
    }

    public void addProduto(Produto produto) {
        this.pedido.addProduto(produto);
    }

    public void pedidoCredito() {
        this.pagamento = new PagamentoCredito(this.pedido);
        if (this.pagamento.realizarPagamento()) {
            this.email.enviarEmail("Pagamento realizado com sucesso via crédito");
        } else {
            this.email.enviarEmail("Falha no pagamento via crédito");
        }
    }

    public void pedidoBoleto() {
        this.pagamento = new PagamentoBoleto(this.pedido);
        if (this.pagamento.realizarPagamento()) {
            this.email.enviarEmail("Pagamento realizado com sucesso via boleto");
        } else {
            this.email.enviarEmail("Falha no pagamento via boleto");
        }
    }
}
