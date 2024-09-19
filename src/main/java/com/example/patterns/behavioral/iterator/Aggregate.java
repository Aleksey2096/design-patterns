package com.example.patterns.behavioral.iterator;

public interface Aggregate<T> {
	Iterator<T> createIterator();
}
