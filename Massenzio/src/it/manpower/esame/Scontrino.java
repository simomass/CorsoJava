package it.manpower.esame;

import java.util.ArrayList;
import java.util.List;

public class Scontrino {
	private List<Articolo> articoli = new ArrayList<>();

//	public Scontrino(List<Articolo> articoli) {
//		this.articoli = articoli;
//	}

	public void add(Articolo articolo) {
		articoli.add(articolo);
	}

	public int calcolaTotale(CalcoloPrezzo s) {
		int prezzoTot=0;
		for(Articolo art : articoli) {
			prezzoTot=prezzoTot+s.ottieniPrezzo(art);
		}
		return prezzoTot;
	}
}
