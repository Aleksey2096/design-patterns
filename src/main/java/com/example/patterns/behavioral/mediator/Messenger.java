package com.example.patterns.behavioral.mediator;

public interface Messenger {
    void sendMessage(String msg, String userId);

    void addUser(User user);
}