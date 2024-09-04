package com.roberto.designpatterns.criacionais.factorymethod.bancodobrasil;

import com.roberto.designpatterns.criacionais.factorymethod.Banco;
import com.roberto.designpatterns.criacionais.factorymethod.Boleto;
import com.roberto.designpatterns.criacionais.factorymethod.bancocaixa.BancoCaixaBoleto10Dias;
import com.roberto.designpatterns.criacionais.factorymethod.bancocaixa.BancoCaixaBoleto30Dias;
import com.roberto.designpatterns.criacionais.factorymethod.bancocaixa.BancoCaixaBoleto60Dias;

public class BancoDoBrasil extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimentoBoleto, float valor) {
        //Criação do boleto conforme o vencimento. A palavra new é utilizada 3 vezes.
        Boleto boleto = null;
        switch (vencimentoBoleto) {
            case 10:
                boleto = new BancoDoBrasilBoleto10Dias(valor);
                break;
            case 30:
                boleto = new BancoDoBrasilBoleto30Dias(valor);
                break;
            case 60:
                boleto = new BancoDoBrasilBoleto60Dias(valor);
                break;
            default:
                System.out.println("Vencimento Indisponível");
        }
        return boleto;
    }

}
