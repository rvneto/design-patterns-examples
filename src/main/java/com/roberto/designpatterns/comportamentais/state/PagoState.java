package com.roberto.designpatterns.comportamentais.state;

public class PagoState implements State {

    private final Pedido pedido;

    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println("Operação não suportada, o pedido já foi pago.");
    }

    @Override
    public void despacharPedido() {
        System.out.println("Pedido despachado.");
        pedido.setEstadoAtual(pedido.getEnviado());
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido cancelado.");
        pedido.setEstadoAtual(pedido.getCancelado());
    }
}
