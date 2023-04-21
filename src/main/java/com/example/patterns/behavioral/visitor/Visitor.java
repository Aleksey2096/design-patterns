package com.example.patterns.behavioral.visitor;

public interface Visitor {
    void visit(HtmlElement element);

    void visit(HtmlParentElement parentElement);
}
