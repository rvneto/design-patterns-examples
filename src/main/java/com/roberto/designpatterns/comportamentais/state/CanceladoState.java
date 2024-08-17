package com.roberto.designpatterns.comportamentais.state;

public class CanceladoState implements State {

    private final Pedido pedido;

    public CanceladoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println("Operação não suportada, o pedido se encontra cancelado.");
    }

    @Override
    public void despacharPedido() {
        System.out.println("Operação não suportada, o pedido se encontra cancelado.");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Operação não suportada, o pedido se encontra cancelado.");
    }
}
