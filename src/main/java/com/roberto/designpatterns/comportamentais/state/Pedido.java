package com.roberto.designpatterns.comportamentais.state;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Pedido {

    private final State aguardandoPagamento;
    private final State pago;
    private final State cancelado;
    private final State enviado;
    @Setter
    private State estadoAtual;

    public Pedido() {
        aguardandoPagamento = new AguardandoPagamentoState(this);
        pago = new PagoState(this);
        cancelado = new CanceladoState(this);
        enviado = new EnviadoState(this);
        estadoAtual = aguardandoPagamento;
    }

    public void sucessoAoPagar() {
        estadoAtual.sucessoAoPagar();
    }

    public void cancelarPedido() {
        estadoAtual.cancelarPedido();
    }

    public void despacharPedido() {
        estadoAtual.despacharPedido();
    }

}
