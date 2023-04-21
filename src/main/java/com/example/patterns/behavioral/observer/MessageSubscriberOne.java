package com.example.patterns.behavioral.observer;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(final Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}