package it.manpower.pattern.main;

import java.math.BigDecimal;

import it.manpower.pattern.strategy.CalcolaPrezzoNatale;
import it.manpower.pattern.strategy.Carrello;
import it.manpower.pattern.templatemethod.Prodotto;

public class StrategyExampleMain {

	public static void main(String[] args) {
		Carrello carrello = new Carrello();
		
		carrello.addProdotto(new Prodotto("Scarpe", new BigDecimal("100")));
		carrello.addProdotto(new Prodotto("Cintura", new BigDecimal("30")));

		System.out.println( carrello.calcolaPrezzo(new CalcolaPrezzoNatale()) );
		
	}

}
