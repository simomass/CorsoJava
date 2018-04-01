package it.manpower.pattern.strategy;

import java.math.BigDecimal;

import it.manpower.pattern.templatemethod.Prodotto;

public class CalcolaPrezzoNatale implements CalcolaPrezzoStrategy {

	@Override
	public BigDecimal calcolaPrezzo(Prodotto p) {
		return p.getPrezzo().multiply(new BigDecimal("0.75"));
	}

}
