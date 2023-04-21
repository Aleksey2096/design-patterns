package com.example.patterns.behavioral.interpreter;

public class Add implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Add(final Expression leftExpression,
               final Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
