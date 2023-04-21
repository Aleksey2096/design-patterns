package com.example.patterns.behavioral.visitor;

public class CssClassVisitor implements Visitor {

    @Override
    public void visit(final HtmlElement element) {
        element.setStartTag(
                element.getStartTag().replace(">", " class='visitor'>"));

    }

    @Override
    public void visit(final HtmlParentElement parentElement) {
        parentElement.setStartTag(
                parentElement.getStartTag().replace(">", " class='visitor'>"));
    }
}