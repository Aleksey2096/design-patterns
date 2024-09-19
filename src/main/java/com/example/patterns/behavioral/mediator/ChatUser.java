package com.example.patterns.behavioral.mediator;

public class ChatUser extends User {

	public ChatUser(Messenger chatRoom, String id, String name) {
		super(chatRoom, id, name);
	}

	@Override
	public void send(String msg, String userReceiverId) {
		System.out.println(this.getName() + " :: Sending Chat Message : " + msg);
		getMessenger().sendMessage(msg, userReceiverId);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.getName() + " :: Received Chat Message : " + msg);
	}
}