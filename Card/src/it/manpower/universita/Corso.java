package it.manpower.universita;

public class Corso {
	private String nome;
	private Integer crediti;
	
	public Corso(String nome, Integer crediti) {
		setNome(nome);
		setCrediti(crediti);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCrediti(Integer crediti) {
		this.crediti = crediti;
	}
	
	public String getNome() {
		return nome;
	}	
	public Integer getCrediti() {
		return crediti;
	}
}
