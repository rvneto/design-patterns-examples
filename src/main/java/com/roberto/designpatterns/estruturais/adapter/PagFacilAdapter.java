package com.roberto.designpatterns.estruturais.adapter;

import com.roberto.designpatterns.estruturais.adapter.terceiros.PagFacil;

public class PagFacilAdapter extends PagFacil implements Gateway {

    // Não é necessário implementar métodos aqui, a classe PagFacil já os implementa (Herança).
    // Repare que os métodos da classe PagFacil são idênticos aos da interface Gateway.

}
