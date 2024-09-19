package com.example.patterns.behavioral.interpreter;

public class ExpressionUtils {
	public static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*");
	}

	public static Expression getOperator(String s, Expression left, Expression right) {
		return switch (s) {
		case "+" -> new Add(left, right);
		case "-" -> new Substract(left, right);
		case "*" -> new Product(left, right);
		default -> null;
		};
	}
}
