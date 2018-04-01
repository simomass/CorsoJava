package it.manpower.pattern.templatemethod;

import java.math.BigDecimal;

public class CarrelloOrdinario extends Carrello {

	@Override
	protected BigDecimal calcolaPrezzo(Prodotto p) {
		return p.getPrezzo();
	}

}
