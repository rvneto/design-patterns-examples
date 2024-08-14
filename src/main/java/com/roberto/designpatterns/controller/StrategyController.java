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
    public List<String> test() {

        FreteComum freteComum = new FreteComum();
        FreteExpresso freteExpresso = new FreteExpresso();

        PedidoEletronicos pedidoEletronicos = new PedidoEletronicos();
        pedidoEletronicos.setValor(new BigDecimal(100));
        pedidoEletronicos.setTipoFrete(freteComum);

        List<String> list = new ArrayList<>();
        list.add("Eletrônicos Valor Pedido: R$ " + pedidoEletronicos.getValor());
        list.add("Eletrônicos Frete Comum: R$ " + pedidoEletronicos.calculaFrete());

        pedidoEletronicos.setTipoFrete(freteExpresso);
        list.add("Eletrônicos Frete Expresso: R$ " + pedidoEletronicos.calculaFrete());

        PedidoMoveis pedidoMoveis = new PedidoMoveis();
        pedidoMoveis.setValor(new BigDecimal(200));
        pedidoMoveis.setTipoFrete(freteComum);

        list.add("Moveis Valor Pedido: R$ " + pedidoMoveis.getValor());
        list.add("Moveis Frete Comum: R$ " + pedidoMoveis.calculaFrete());
        pedidoMoveis.setTipoFrete(freteExpresso);

        list.add("Moveis Frete Expresso: R$ " + pedidoMoveis.calculaFrete());

        return list;
    }

}
