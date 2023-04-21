package com.example.patterns.structural.composite;

import java.util.List;

public abstract class HtmlTag {

	public abstract String getTagName();

	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);

	public void setTagBody(final String tagBody) {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public void addChildTag(final HtmlTag htmlTag) {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public void removeChildTag(final HtmlTag htmlTag) {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public List<HtmlTag> getChildren() {
		throw new UnsupportedOperationException(
				"Current operation is not support for this object");
	}

	public abstract void generateHtml();
}
