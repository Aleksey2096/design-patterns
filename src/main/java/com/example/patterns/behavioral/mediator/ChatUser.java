package com.example.patterns.behavioral.mediator;

public class ChatUser extends User {

    public ChatUser(final IChatRoom room, final String id, final String name) {
        super(room, id, name);
    }

    @Override
    public void send(final String msg, final String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(final String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }

}