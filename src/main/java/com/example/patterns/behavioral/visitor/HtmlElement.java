package com.example.patterns.behavioral.visitor;

public class HtmlElement extends HtmlTag {
    private final String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(final String tagName) {
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
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
    public void setTagBody(final String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag + "" + tagBody + "" + endTag);
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}