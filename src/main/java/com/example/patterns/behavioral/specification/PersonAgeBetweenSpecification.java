package com.example.patterns.behavioral.specification;

public class PersonAgeBetweenSpecification implements AbstractSpecification<Person> {
	private final Integer minAge;
	private final Integer maxAge;

	public PersonAgeBetweenSpecification(Integer minAge, Integer maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	@Override
	public boolean isSatisfiedBy(Person t) {
		return t.age() >= minAge && t.age() <= maxAge;
	}
}
