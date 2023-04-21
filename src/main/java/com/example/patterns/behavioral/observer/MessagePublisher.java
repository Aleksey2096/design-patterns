package com.example.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(final Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(final Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(final Message m) {
        for (Observer o : observers) {
            o.update(m);
        }
    }
}