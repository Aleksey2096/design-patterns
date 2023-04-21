package com.example.patterns.behavioral.specification;

public class PersonNameSpecification implements AbstractSpecification<Person> {
    private final String name;

    public PersonNameSpecification(final String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(final Person t) {
        return t.name().equals(name);
    }
}
