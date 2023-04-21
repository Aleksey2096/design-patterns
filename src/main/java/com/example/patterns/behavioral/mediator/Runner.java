package com.example.patterns.behavioral.mediator;

public class Runner {
    public static void main(final String[] args) {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom, "1", "Alex");
        User user2 = new ChatUser(chatroom, "2", "Brian");

        chatroom.addUser(user1);
        chatroom.addUser(user2);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
    }
}
