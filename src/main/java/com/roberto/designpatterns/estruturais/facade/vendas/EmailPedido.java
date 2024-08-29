package com.roberto.designpatterns.estruturais.facade.vendas;

public class EmailPedido {

    private Pedido pedido;

    public EmailPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void enviarEmail(String mensagem) {
        System.out.println("Email enviado para " + this.pedido.getConsumidor().getEmail());
        System.out.println("Mensagem: " + mensagem);
    }
}
