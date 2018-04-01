package it.manpower.pattern.main;

import it.manpower.pattern.composite.html.Div;
import it.manpower.pattern.composite.html.Link;
import it.manpower.pattern.composite.html.Paragraph;

public class HtmlCompositeExampleMain {

	public static void main(String[] args) {
		Div d = new Div("myDiv", "divClass");
		Paragraph p = new Paragraph("myP", "pClass", "ciao");
		Link l = new Link("myLink", "linkClass", "http://www.google.it", "vai a google");
		
		d.addChild(p);
		d.addChild(l);
		
		System.out.println( d.render() );
	}

}
