package it.manpower.pattern.composite.html;

public class Paragraph extends HtmlElement {

	private String content;
	
	public Paragraph(String id, String className, String content) {
		super(id, className);
		this.content = content;
	}

	@Override
	public String render() {
		return new StringBuilder()
					.append("<p id=\"")
					.append(getId())
					.append("\" class=\"")
					.append(getClassName())
					.append("\">")
					.append(content)
					.append("</p>")
					.toString();
	}

	@Override
	public void addChild(HtmlElement e) {
		throw new UnsupportedOperationException();
	}

}
