package com.roberto.designpatterns.controller.estruturais;

import com.roberto.designpatterns.estruturais.facade.Consumidor;
import com.roberto.designpatterns.estruturais.facade.Produto;
import com.roberto.designpatterns.estruturais.facade.VendaFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estruturais/facade")
public class FacadeController {

    @GetMapping("test")
    public void test() {

        Consumidor consumidor = new Consumidor("Juca da Silva", "12345678901", "juca_silva@gmail.com");

        Produto produto1 = new Produto("Blusa Rosa", "Blusa feminina rosa", 80.99F);
        Produto produto2 = new Produto("Camiseta Preta", "Camiseta masculina preta", 49.90F);
        Produto produto3 = new Produto("Calça Jeans", "Calça Jeans Masculina", 119.90F);

        VendaFacade facade = new VendaFacade(consumidor);

        facade.addProduto(produto1);
        facade.addProduto(produto2);
        facade.addProduto(produto3);

        facade.pedidoCredito();
    }

}
