package it.manpower.javaee;

public class Card {
	private int numero;
	private Seme seme;
	
	public Card (int numero, Seme seme) {
		if(numero<1||numero>10) {
			throw new RuntimeException("Il numero deve essere compreso tra 1 e 10");
		}
		this.seme=seme;
		this.numero=numero;
	}
	
	public Seme getSeme() {
		return seme;
	}
	
	public int getNum() {
		return numero;
	}

}
