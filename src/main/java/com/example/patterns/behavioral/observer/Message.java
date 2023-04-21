package com.example.patterns.behavioral.observer;

public class Message {
    final String messageContent;

    public Message(final String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}