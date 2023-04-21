package com.example.patterns.behavioral.specification;

import java.util.HashSet;
import java.util.Set;

public class OrSpecification<T> implements AbstractSpecification<T> {
    private final Set<Specification<T>> set = new HashSet<>();

    public OrSpecification(final Specification<T> a, final Specification<T> b) {
        set.add(a);
        set.add(b);
    }

    @Override
    public boolean isSatisfiedBy(final T t) {
        for (Specification<T> s : set) {
            if (s.isSatisfiedBy(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public AbstractSpecification<T> or(final Specification<T> s) {
        set.add(s);
        return this;
    }
}
