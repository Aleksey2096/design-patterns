package com.example.patterns.behavioral.specification;

public class PersonAgeBetweenSpecification
        implements AbstractSpecification<Person> {
    private final Integer minAge;
    private final Integer maxAge;

    public PersonAgeBetweenSpecification(final Integer minAge,
                                         final Integer maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean isSatisfiedBy(final Person t) {
        return t.age() >= minAge && t.age() <= maxAge;
    }
}
