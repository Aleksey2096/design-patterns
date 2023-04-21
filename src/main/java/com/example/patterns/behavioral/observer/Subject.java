package com.example.patterns.behavioral.observer;

public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyUpdate(Message m);
}