package com.example.patterns.behavioral.observer;

public class MessageSubscriber implements Observer {
	private final String name;

	public MessageSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(Message m) {
		System.out.println(name + " :: " + m.getMessageContent());
	}
}
