package com.example.patterns.behavioral.specification;

public interface AbstractSpecification<T> extends Specification<T> {
	default AbstractSpecification<T> or(Specification<T> s) {
		return new OrSpecification<>(this, s);
	}

	default AbstractSpecification<T> and(Specification<T> s) {
		return new AndSpecification<>(this, s);
	}

	default AbstractSpecification<T> not() {
		return new NotSpecification<>(this);
	}
}
