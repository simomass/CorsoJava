package it.manpower.pattern.builder;

public class Paragraph extends HtmlElement {

	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public void addChildren(HtmlElement e) {
		throw new UnsupportedOperationException();
	}

}
