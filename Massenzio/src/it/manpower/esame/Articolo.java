package it.manpower.esame;

public class Articolo {
	private String nome;
	private Categoria categoria;
	public Articolo(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public static String values() {
		return null;
	}
	

}
