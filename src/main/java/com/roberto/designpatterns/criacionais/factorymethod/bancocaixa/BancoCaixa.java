package com.roberto.designpatterns.criacionais.factorymethod.bancocaixa;

import com.roberto.designpatterns.criacionais.factorymethod.Banco;
import com.roberto.designpatterns.criacionais.factorymethod.Boleto;

public class BancoCaixa extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimentoBoleto, float valor) {
        //Criação do boleto conforme o vencimento. A palavra new é utilizada 3 vezes.
        Boleto boleto = null;
        switch (vencimentoBoleto) {
            case 10:
                boleto = new BancoCaixaBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoCaixaBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoCaixaBoleto60Dias(valor);
                break;
            default:
                System.out.println("Vencimento Indisponível");
        }
        return boleto;
    }

}
