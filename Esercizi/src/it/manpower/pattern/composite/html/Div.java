package it.manpower.pattern.composite.html;

import java.util.LinkedList;
import java.util.List;

public class Div extends HtmlElement {

	private List<HtmlElement> children;
	
	public Div(String id, String className) {
		super(id, className);
		children = new LinkedList<>();
	}

	@Override
	public String render() {
		StringBuilder builder = new StringBuilder();
		builder.append("<div id=\"")
				.append(getId())
				.append("\" class=\"")
				.append(getClassName())
				.append("\">");
		
		for(HtmlElement e : children) {
			builder.append(e.render());
		}
		
		builder.append("</div>");
		
		return builder.toString();
	}

	@Override
	public void addChild(HtmlElement e) {
		children.add(e);
	}

}
