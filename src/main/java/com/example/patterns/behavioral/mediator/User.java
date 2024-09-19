package com.example.patterns.behavioral.mediator;

public abstract class User {
	private final Messenger messenger;

	private final String id;
	private final String name;

	public User(Messenger room, String id, String name) {
		this.messenger = room;
		this.name = name;
		this.id = id;
	}

	public abstract void send(String msg, String userId);

	public abstract void receive(String msg);

	public Messenger getMessenger() {
		return messenger;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}