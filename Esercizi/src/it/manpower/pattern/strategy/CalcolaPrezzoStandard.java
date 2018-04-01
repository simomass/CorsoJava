package it.manpower.pattern.strategy;

import java.math.BigDecimal;

import it.manpower.pattern.templatemethod.Prodotto;

public class CalcolaPrezzoStandard implements CalcolaPrezzoStrategy {

	@Override
	public BigDecimal calcolaPrezzo(Prodotto p) {
		return p.getPrezzo();
	}

}
