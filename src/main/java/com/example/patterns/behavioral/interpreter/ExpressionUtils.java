package com.example.patterns.behavioral.interpreter;

public class ExpressionUtils {
    public static boolean isOperator(final String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperator(final String s, final Expression left,
                                         final Expression right) {
        return switch (s) {
            case "+" -> new Add(left, right);
            case "-" -> new Substract(left, right);
            case "*" -> new Product(left, right);
            default -> null;
        };
    }
}