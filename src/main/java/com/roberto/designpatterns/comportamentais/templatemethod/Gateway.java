package com.roberto.designpatterns.comportamentais.templatemethod;

import lombok.AllArgsConstructor;

import java.util.Random;

public class Gateway {

    public boolean cobrar(float valor) {
        System.out.println("R$ " + valor);
        return new Random().nextBoolean();
    }

}
