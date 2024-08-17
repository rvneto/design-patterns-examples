package com.roberto.designpatterns.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(messages.getLast());
        }
    }

    public void addMessage(String message) {
        messages.add(message);
        notifyObservers();
    }
}
