package com.example.patterns.behavioral.specification;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private final static List<Person> PEOPLE;

    static {
        PEOPLE = new ArrayList<>();
        PEOPLE.add(new Person(1, "Billy", 29));
        PEOPLE.add(new Person(2, "Tommy", 44));
        PEOPLE.add(new Person(3, "Sally", 18));
        PEOPLE.add(new Person(4, "Jerry", 33));
        PEOPLE.add(new Person(5, "Sammy", 55));
    }

    public static void main(final String[] args) {
        Specification<Person> spec1 = new PersonAgeBetweenSpecification(40, 60)
                .and(new PersonNameSpecification("Tommy"))
                .or(new PersonNameSpecification("Sally"))
                .and(new PersonIdSpecification(5).not());
        System.out.println(findBySpecification(spec1));
    }

    private static List<Person> findBySpecification(
            final Specification<Person> specification) {
        return PEOPLE.stream().filter(specification::isSatisfiedBy).toList();
    }
}
