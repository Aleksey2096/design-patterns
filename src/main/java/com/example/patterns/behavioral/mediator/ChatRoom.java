package com.example.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements Messenger {

	private final Map<String, User> usersMap = new HashMap<>();

	@Override
	public void sendMessage(String msg, String userId) {
		User u = usersMap.get(userId);
		u.receive(msg);
	}

	@Override
	public void addUser(User user) {
		this.usersMap.put(user.getId(), user);
	}
}
