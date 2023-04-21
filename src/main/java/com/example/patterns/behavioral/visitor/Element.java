package com.example.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
