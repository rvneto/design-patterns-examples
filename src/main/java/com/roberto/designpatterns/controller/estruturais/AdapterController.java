package com.roberto.designpatterns.controller.estruturais;

import com.roberto.designpatterns.estruturais.adapter.Cobranca;
import com.roberto.designpatterns.estruturais.adapter.PagFacilAdapter;
import com.roberto.designpatterns.estruturais.adapter.TopPagamentosAdapter;
import com.roberto.designpatterns.estruturais.adapter.terceiros.TopPagamentos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estruturais/adapter")
public class AdapterController {

    @GetMapping("test")
    public void test() {

        // ==== Classes dos fornecedores ====
        // E uma instância da classe de TopPagamentos
        TopPagamentos topPagamentos = new TopPagamentos();

        // ==== Adapters ====
        // Criação do adaptador de PagFacil
        PagFacilAdapter pagFacilAdapter = new PagFacilAdapter();

        // Criação do adaptador de TopPagamentos
        TopPagamentosAdapter topPagamentosAdapter = new TopPagamentosAdapter(topPagamentos);

        // ==== Cobranca ====
        System.out.println("Cobrança utilizando PagFacil como Gateway");

        // Criação de uma Cobrança utilidando a classe PagFacil
        // Repare que o adaptador de $pagFacil é passado para o construtor
        Cobranca cobranca = new Cobranca(pagFacilAdapter);
        cobranca.setValor(100);
        cobranca.setParcelas(3);
        cobranca.setNumeroCartao("1234123412341234");
        cobranca.setCVV("123");

        if (cobranca.realizarPagamento()) {
            System.out.println("Pagamento realizado com sucesso");
        } else {
            System.out.println("Pagamento falhou");
        }

        // Troca do Gateway de Cobrança para TopPagamentos
        System.out.println("Cobrança utilizando TopPagamentos como Gateway");
        cobranca.setGateway(topPagamentosAdapter);
        cobranca.setValor(100);
        cobranca.setParcelas(3);
        cobranca.setNumeroCartao("1234123412341234");
        cobranca.setCVV("123");

        if (cobranca.realizarPagamento()) {
            System.out.println("Pagamento realizado com sucesso");
        } else {
            System.out.println("Pagamento falhou");
        }

    }

}
