package com.example.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom {

    private final Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(final String msg, final String userId) {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(final User user) {
        this.usersMap.put(user.getId(), user);
    }
}
