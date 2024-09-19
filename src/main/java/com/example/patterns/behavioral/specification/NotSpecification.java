package com.example.patterns.behavioral.specification;

public class NotSpecification<T> implements AbstractSpecification<T> {
	private final Specification<T> spec;

	public NotSpecification(Specification<T> newSpec) {
		spec = newSpec;
	}

	@Override
	public boolean isSatisfiedBy(T t) {
		return !spec.isSatisfiedBy(t);
	}
}
