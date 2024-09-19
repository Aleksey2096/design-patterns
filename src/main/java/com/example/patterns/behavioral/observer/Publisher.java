package com.example.patterns.behavioral.observer;

public interface Publisher {
    void attach(Observer o);

    void detach(Observer o);

    void notifyUpdate(Message m);
}