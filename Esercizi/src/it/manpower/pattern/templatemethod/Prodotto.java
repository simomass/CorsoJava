package it.manpower.pattern.templatemethod;

import java.math.BigDecimal;

public class Prodotto {
	
	private String nome;
	private BigDecimal prezzo;
	
	public Prodotto(String nome, BigDecimal prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

}
