package it.manpower.pattern.composite.html;

public abstract class HtmlElement {

	private String id;
	private String className;

	public HtmlElement(String id, String className) {
		this.id = id;
		this.className = className;
	}
	
	public String getId() {
		return id;
	}
	public String getClassName() {
		return className;
	}
	
	public abstract String render();
	public abstract void addChild(HtmlElement e);

}
