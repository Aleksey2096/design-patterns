package com.example.patterns.creational.prototype;

public class Circle extends Shape {
	protected int radius;

	public Circle() {
	}

	public Circle(Circle target) {
		super(target);
		if (target != null) {
			radius = target.radius;
		}
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Circle) || !super.equals(object2)) {
			return false;
		}
		Circle shape2 = (Circle) object2;
		return shape2.radius == radius;
	}
}
