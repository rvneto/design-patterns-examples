package com.roberto.designpatterns.controller;

import com.roberto.designpatterns.comportamentais.state.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController {

    @GetMapping("test")
    public void test() {
        Pedido pedido = new Pedido();
        pedido.sucessoAoPagar();
        //pedido.cancelarPedido();
        pedido.despacharPedido();
    }

}
