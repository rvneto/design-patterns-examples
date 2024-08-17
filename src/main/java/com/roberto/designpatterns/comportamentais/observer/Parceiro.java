package com.roberto.designpatterns.comportamentais.observer;

public class Parceiro implements Observer {

    private String nome;

    private String email;

    private Subject subject;

    public Parceiro(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(String message) {
        Email.enviarEmail(this, message);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
