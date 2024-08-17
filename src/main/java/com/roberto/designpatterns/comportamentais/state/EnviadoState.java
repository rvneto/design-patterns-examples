package com.roberto.designpatterns.comportamentais.state;

public class EnviadoState implements State {

    private final Pedido pedido;

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println("Operação não suportada, o pedido já foi pago e enviado.");
    }

    @Override
    public void despacharPedido() {
        System.out.println("Operação não suportada, o pedido já foi enviado.");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Operação não suportada, o pedido já foi enviado.");
    }
}
