package it.manpower.jdbc.testing;

public class Paziente {

	private String nome;
	private String cognome;
	private String cf;
	
	public Paziente(String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getCf() {
		return cf;
	}

	@Override
	public String toString() {
		return "Paziente [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + "]";
	}
	
}
