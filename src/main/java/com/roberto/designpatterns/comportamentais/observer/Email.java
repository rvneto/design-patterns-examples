package com.roberto.designpatterns.comportamentais.observer;

public class Email {

    static void enviarEmail(Observer observer, String message) {
        System.out.println("------------------------------------------------------");
        System.out.println("Email enviado para " + observer.getNome() + " - " + observer.getEmail());
        System.out.println("Mensagem: " + message);
    }

}
