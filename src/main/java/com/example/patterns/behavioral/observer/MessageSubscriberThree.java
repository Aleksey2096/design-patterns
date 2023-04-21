package com.example.patterns.behavioral.observer;

public class MessageSubscriberThree implements Observer {
    @Override
    public void update(final Message m) {
        System.out.println(
                "MessageSubscriberThree :: " + m.getMessageContent());
    }
}