package com.example.patterns.behavioral.mediator;

public abstract class User {
    private final IChatRoom mediator;

    private final String id;
    private final String name;

    public User(final IChatRoom room, final String id, final String name) {
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);

    public abstract void receive(String msg);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}