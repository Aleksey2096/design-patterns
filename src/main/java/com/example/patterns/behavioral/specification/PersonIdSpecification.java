package com.example.patterns.behavioral.specification;

public class PersonIdSpecification implements AbstractSpecification<Person> {
	private final Integer id;

	public PersonIdSpecification(Integer id) {
		this.id = id;
	}

	@Override
	public boolean isSatisfiedBy(Person t) {
		return t.id().equals(id);
	}
}
