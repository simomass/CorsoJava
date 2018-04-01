package it.manpower.pattern.main;

import it.manpower.pattern.builder.Div;
import it.manpower.pattern.builder.Paragraph;

public class HtmlBuilderExampleMain {

	public static void main(String[] args) {
		Div d = new Div();
		d.setClassName("my-div-class");
		
		Paragraph p = new Paragraph();
		p.setId("my-para-id");
		p.setClassName("my-para-class");
		p.setContent("contenuto");
		
		d.addChildren(p);
	}

}
