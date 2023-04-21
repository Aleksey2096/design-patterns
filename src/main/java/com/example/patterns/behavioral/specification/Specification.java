package com.example.patterns.behavioral.specification;

public interface Specification<T> {
    boolean isSatisfiedBy(T t);
}
