package com.example.patterns.behavioral.observer;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(final Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}