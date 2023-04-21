package com.example.patterns.behavioral.iterator;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

    private final Shape[] shapes;
    int pos;

    public ShapeIterator(final Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public boolean hasNext() {
        return pos < shapes.length && shapes[pos] != null;
    }

    @Override
    public Shape next() {
        return shapes[pos++];
    }

    @Override
    public void remove() {
        if (pos <= 0)
            throw new IllegalStateException("Illegal position");
        if (shapes[pos - 1] != null) {
            if (shapes.length - 1 - (pos - 1) >= 0)
                System.arraycopy(shapes, pos - 1 + 1, shapes, pos - 1,
                        shapes.length - 1 - (pos - 1));
            shapes[shapes.length - 1] = null;
        }
    }
}
