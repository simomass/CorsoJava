package it.manpower.pattern.composite.html;

public class Link extends HtmlElement {

	private String href;
	private String content;
	
	public Link(String id, String className, String href, String content) {
		super(id, className);
		this.href = href;
		this.content = content;
	}

	@Override
	public String render() {
		return new StringBuilder()
					.append("<a id=\"")
					.append(getId())
					.append("\" class=")
					.append(getClassName())
					.append(" href=\"")
					.append(href)
					.append("\">")
					.append(content)
					.append("</a>")
					.toString();
	}

	@Override
	public void addChild(HtmlElement e) {
		throw new UnsupportedOperationException();
	}

}
