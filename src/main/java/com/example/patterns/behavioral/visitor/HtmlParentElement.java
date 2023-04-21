package com.example.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
    private final String tagName;
    private String startTag;
    private String endTag;
    private final List<HtmlTag> childrenTag;

    public HtmlParentElement(final String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(final String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(final String tag) {
        this.endTag = tag;
    }

    @Override
    public String getStartTag() {
        return startTag;
    }

    @Override
    public String getEndTag() {
        return endTag;
    }

    @Override
    public void addChildTag(final HtmlTag htmlTag) {
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(final HtmlTag htmlTag) {
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childrenTag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag tag : childrenTag) {
            tag.generateHtml();
        }
        System.out.println(endTag);
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}