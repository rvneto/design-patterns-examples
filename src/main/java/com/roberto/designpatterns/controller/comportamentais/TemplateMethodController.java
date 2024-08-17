package com.roberto.designpatterns.controller.comportamentais;

import com.roberto.designpatterns.comportamentais.templatemethod.Gateway;
import com.roberto.designpatterns.comportamentais.templatemethod.PagamentoCredito;
import com.roberto.designpatterns.comportamentais.templatemethod.PagamentoDebito;
import com.roberto.designpatterns.comportamentais.templatemethod.PagamentoDinheiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comportamentais/template-method")
public class TemplateMethodController {

    @GetMapping("test")
    public void test() {

        float valor = 1000;
        Gateway gateway = new Gateway();

        // Pagamento CREDITO
        System.out.println("Crédito");
        PagamentoCredito pagamentoCredito = new PagamentoCredito(valor, gateway);
        boolean resultado = pagamentoCredito.realizarCobranca(valor);

        // Pagamento DEBITO
        System.out.println("Debito");
        PagamentoDebito pagamentoDebito = new PagamentoDebito(valor, gateway);
        resultado = pagamentoDebito.realizarCobranca(valor);

        // Pagamento DINHEIRO
        System.out.println("Dinheiro");
        PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(valor, gateway);
        resultado = pagamentoDinheiro.realizarCobranca(valor);

    }

}
