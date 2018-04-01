package it.manpower.pattern.strategy;

import java.math.BigDecimal;

import it.manpower.pattern.templatemethod.Prodotto;

public interface CalcolaPrezzoStrategy {

	BigDecimal calcolaPrezzo(Prodotto p);
	
}
