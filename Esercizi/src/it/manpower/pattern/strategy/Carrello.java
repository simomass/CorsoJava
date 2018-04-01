package it.manpower.pattern.strategy;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import it.manpower.pattern.templatemethod.Prodotto;

public class Carrello {

	private List<Prodotto> prodotti;
	
	public Carrello() {
		prodotti = new LinkedList<>();
	}
	
	public void addProdotto(Prodotto p) {
		prodotti.add(p);
	}
	
	public BigDecimal calcolaPrezzo(CalcolaPrezzoStrategy strategy) {
		BigDecimal total = BigDecimal.ZERO;
		
		for(Prodotto p : prodotti) {
			total = total.add(strategy.calcolaPrezzo(p));
		}
		
		return total;
	}
	
}
