package com.example.patterns.behavioral.iterator;

public interface Iterator<T> {
	boolean hasNext();

	T next();
}
