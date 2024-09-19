package com.example.patterns.behavioral.specification;

public class PersonNameSpecification implements AbstractSpecification<Person> {
	private final String name;

	public PersonNameSpecification(String name) {
		this.name = name;
	}

	@Override
	public boolean isSatisfiedBy(Person t) {
		return t.name().equals(name);
	}
}
