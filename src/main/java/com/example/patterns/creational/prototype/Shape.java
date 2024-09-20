package com.example.patterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {
	protected int x;
	protected int y;
	protected String color;

	public abstract Shape clone();

	public Shape() {
	}

	public Shape(Shape target) {
		if (target != null) {
			x = target.x;
			y = target.y;
			color = target.color;
		}
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Shape)) {
			return false;
		}
		Shape shape2 = (Shape) object2;
		return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
	}
}
