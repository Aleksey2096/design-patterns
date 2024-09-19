package com.example.patterns.behavioral.observer;

public class Runner {
	public static void main(String[] args) {
		Observer s1 = new MessageSubscriber("MessageSubscriberOne");
		Observer s2 = new MessageSubscriber("MessageSubscriberTwo");
		Observer s3 = new MessageSubscriber("MessageSubscriberThree");

		Publisher p = new MessagePublisher();

		p.attach(s1);
		p.attach(s2);

		p.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update

		p.detach(s1);
		p.attach(s3);

		p.notifyUpdate(new Message("Second Message")); // s2 and s3 will receive the update
	}
}
