package it.manpower.esame;

public class Cliente {
	private int id;
	private String nome;
	private String cognome;
	private String cf;

	public Cliente(int id, String nome, String cognome, String cf) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}	
	public int getId() {
		return id;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCf() {
		return cf;
	}

}
