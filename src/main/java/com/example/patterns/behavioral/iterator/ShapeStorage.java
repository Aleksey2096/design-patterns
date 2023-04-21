package com.example.patterns.behavioral.iterator;

public class ShapeStorage {

    private final Shape[] shapes = new Shape[5];
    private int index;

    public void addShape(final String name) {
        int i = index++;
        shapes[i] = new Shape(i, name);
    }

    public Shape[] getShapes() {
        return shapes;
    }
}