package it.manpower.javaee;

public class Card implements Comparable<Card> {
	protected static final int MAX_VALUE = 10;
	protected static final int MIN_VALUE = 1;
	private int numero;
	private Seme seme;

	public Card(int numero, Seme seme) {
		if (numero < MIN_VALUE || numero > MAX_VALUE) {
			throw new RuntimeException("Il numero deve essere compreso tra 1 e 10");
		}
		this.seme = seme;
		this.numero = numero;
	}

	public Seme getSeme() {
		return seme;
	}

	public int getNum() {
		return numero;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(numero == 1) {
			sb.append("Asso");
			
		} else if(numero == 8) {
			sb.append("Gobbo");
			
		} else if(numero == 9) {
			sb.append("Donna");
			
		} else if(numero == 10) {
			sb.append("Regio");
			
		} else {
			sb.append(numero);
		}
		sb.append(" di ");
		sb.append(seme);
		
		return sb.toString();
	}

	@Override
	public int compareTo(Card o) {
		int result=seme.compareTo(o.getSeme());
		if(result!=0) {
			return result;
		}
		return numero - o.getNum();
}
}
