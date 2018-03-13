package it.manpower.universita;

public class Esame {
	private Integer voto;
	private Boolean lode;
	private Corso corso;

	public Esame(Integer voto, Boolean lode, Corso corso) {
		setVoto(voto);
		setLode(lode);
		this.corso = corso;
	}

	public Boolean getLode() {
		return lode;
	}

	public Integer getVoto() {
		return voto;
	}

	public void setLode(Boolean lode) {
		if (voto!=30) {
			this.lode = false;
			return;
		} 
		
		this.lode=lode;
		
	}

	public void setCorso(String nome, Integer crediti) {
		this.corso.setNome(nome);
		this.corso.setCrediti(crediti);
	}

	public void setVoto(Integer voto) {
		if (voto > 30 | voto < 18) {
			throw new RuntimeException("Voto compreso tra 18 e 30");
		} else {
			this.voto = voto;
		}
	}
	
	public Corso getCorso() {
		return corso;
	}

}
