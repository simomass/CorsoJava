package it.manpower.pattern.templatemethod;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public abstract class Carrello {

	private List<Prodotto> prodotti;
	
	public Carrello() {
		prodotti = new LinkedList<>();
	}
	
	public void addProdotto(Prodotto p) {
		prodotti.add(p);
	}
	
	public BigDecimal calcolaTotale() {
		BigDecimal total = BigDecimal.ZERO;
		for(Prodotto p : prodotti) {
			total = total.add(calcolaPrezzo(p));
		}
		
		return total;
	}
	
	protected abstract BigDecimal calcolaPrezzo(Prodotto p);
}
