package it.manpower.pattern.templatemethod;

import java.math.BigDecimal;

public class CarrelloNatale extends Carrello {

	@Override
	protected BigDecimal calcolaPrezzo(Prodotto p) {
		return p.getPrezzo().multiply(new BigDecimal("0.75"));
	}

}
