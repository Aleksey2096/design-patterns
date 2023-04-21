package com.example.patterns.behavioral.visitor;

public class StyleVisitor implements Visitor {

    @Override
    public void visit(final HtmlElement element) {
        element.setStartTag(
                element.getStartTag().replace(">", " style='width:46px;'>"));

    }

    @Override
    public void visit(final HtmlParentElement parentElement) {
        parentElement
                .setStartTag(parentElement.getStartTag()
                        .replace(">", " style='width:58px;'>"));
    }
}