package com.roberto.designpatterns.controller.criacionais;

import com.roberto.designpatterns.criacionais.factorymethod.Banco;
import com.roberto.designpatterns.criacionais.factorymethod.bancocaixa.BancoCaixa;
import com.roberto.designpatterns.criacionais.factorymethod.bancodobrasil.BancoDoBrasil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/criacionais/factory-method")
public class FactoryMethodController {

    @GetMapping("test")
    public void test() {

        System.out.println(" ***** CAIXA *****");

        Banco bancoCaixa = new BancoCaixa();
        bancoCaixa.gerarBoleto(10, 100);
        bancoCaixa.gerarBoleto(30, 100);
        bancoCaixa.gerarBoleto(60, 100);

        System.out.println(" ***** BANCO DO BRASIL *****");

        Banco bancoDoBrasil = new BancoDoBrasil();
        bancoDoBrasil.gerarBoleto(10, 100);
        bancoDoBrasil.gerarBoleto(30, 100);
        bancoDoBrasil.gerarBoleto(60, 100);

    }

}
