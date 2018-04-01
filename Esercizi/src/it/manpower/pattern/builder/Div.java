package it.manpower.pattern.builder;

import java.util.LinkedList;
import java.util.List;

public class Div extends HtmlElement {

	private List<HtmlElement> children;
	
	public Div() {
		children = new LinkedList<>();
	}
	
	@Override
	public void addChildren(HtmlElement e) {
		children.add(e);
	}

}
