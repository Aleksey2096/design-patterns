package com.example.patterns.behavioral.mediator;

public interface IChatRoom {
    void sendMessage(String msg, String userId);

    void addUser(User user);
}