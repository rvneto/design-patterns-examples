package com.roberto.designpatterns.comportamentais.state;

public class AguardandoPagamentoState implements State {

    private final Pedido pedido;

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println("Pedido pago.");
        pedido.setEstadoAtual(pedido.getPago());
    }

    @Override
    public void despacharPedido() {
        System.out.println("Operação não suportada, o pedido ainda não foi pago.");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Operação não suportada, o pedido ainda não foi pago.");
    }
}
