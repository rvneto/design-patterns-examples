package com.roberto.designpatterns.controller;

import com.roberto.designpatterns.comportamentais.strategy.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @GetMapping("test")
    public void test() {

        FreteComum freteComum = new FreteComum();
        FreteExpresso freteExpresso = new FreteExpresso();

        PedidoEletronicos pedidoEletronicos = new PedidoEletronicos();
        pedidoEletronicos.setValor(100);
        pedidoEletronicos.setTipoFrete(freteComum);

        System.out.println("Eletrônicos Valor Pedido: R$ " + pedidoEletronicos.getValor());
        System.out.println("Eletrônicos Frete Comum: R$ " + pedidoEletronicos.calculaFrete());

        pedidoEletronicos.setTipoFrete(freteExpresso);
        System.out.println("Eletrônicos Frete Expresso: R$ " + pedidoEletronicos.calculaFrete());

        PedidoMoveis pedidoMoveis = new PedidoMoveis();
        pedidoMoveis.setValor(200);
        pedidoMoveis.setTipoFrete(freteComum);

        System.out.println("Moveis Valor Pedido: R$ " + pedidoMoveis.getValor());
        System.out.println("Moveis Frete Comum: R$ " + pedidoMoveis.calculaFrete());
        pedidoMoveis.setTipoFrete(freteExpresso);

        System.out.println("Moveis Frete Expresso: R$ " + pedidoMoveis.calculaFrete());
    }

}
