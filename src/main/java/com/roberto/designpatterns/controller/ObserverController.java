package com.roberto.designpatterns.controller;

import com.roberto.designpatterns.comportamentais.observer.*;
import com.roberto.designpatterns.comportamentais.templatemethod.Gateway;
import com.roberto.designpatterns.comportamentais.templatemethod.PagamentoCredito;
import com.roberto.designpatterns.comportamentais.templatemethod.PagamentoDebito;
import com.roberto.designpatterns.comportamentais.templatemethod.PagamentoDinheiro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/observer")
public class ObserverController {

    @GetMapping("test")
    public void test() {

        // Criação da Newsletter (Subject)
        Newsletter newsletter = new Newsletter();

        // Criação de funcionários
        Funcionario funcionario1 = new Funcionario("Funcionario 1", "funcionario1@email.com", newsletter);
        Funcionario funcionario2 = new Funcionario("Funcionario 2", "funcionario2@email.com", newsletter);

        // Criação de clientes
        Cliente cliente = new Cliente("Cliente 1", "cliente1@email.com", newsletter);

        // Criação de parceiros
        Parceiro parceiro = new Parceiro("Parceiro 1", "parceiro1@email.com", newsletter);

        // Criação de fornecedores
        Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "fornecedor1@email.com", newsletter);

        // Envio da primeira mensagem
        newsletter.addMessage("Primeira mensagem");
        System.out.println(" ");
        System.out.println("************************");
        System.out.println(" ");

        // Remoção do Funcionario 2 da lista de objetos (observers) a serem notificados
        newsletter.removeObserver(funcionario2);

        // Envio da segunda mensagem
        newsletter.addMessage("Segunda mensagem");
        System.out.println(" ");
        System.out.println("************************");
        System.out.println(" ");

        // O Funcionário 2 é reinserido na lista de observers
        newsletter.registerObserver(funcionario2);

        // Envio da terceira mensagem
        newsletter.addMessage("Terceira mensagem");
        System.out.println(" ");
        System.out.println("************************");
        System.out.println(" ");

    }

}
