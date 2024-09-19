package com.example.patterns.behavioral.iterator;

import java.util.List;

public class Company implements Aggregate<Employee> {
	private List<Employee> employees;

	public Company(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public Iterator<Employee> createIterator() {
		return new EmployeeIterator(employees);
	}
}
