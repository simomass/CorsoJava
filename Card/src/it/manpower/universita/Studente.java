package it.manpower.universita;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	private Esame[] esami;
	private int contatore=0;
//	private float[] crediti;

	public Studente(String nome, String cognome, String matricola) {
		setNome(nome);
		setCognome(cognome);
		setMatricola(matricola);
		esami=new Esame[20];
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
//
	public void addEsami(Esame newEsame) {
		esami[contatore]=newEsame;
		contatore++;
	}
	
	public Esame[] getEsami() {
		return esami;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
}
