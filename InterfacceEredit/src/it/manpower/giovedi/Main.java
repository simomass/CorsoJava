package it.manpower.giovedi;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Elaboratore mah = new Elaboratore();
		//Filter f = new Pari();
		// mah.setF(boh);
		// mah.acceptNumber(12);
		// mah.acceptNumber(22);
		// mah.acceptNumber(7);
		// mah.acceptNumber(9);
		// mah.acceptNumber(5);
		// mah.acceptNumber(4);
		// mah.acceptNumber(7);
		// mah.acceptNumber(1);
		// mah.acceptNumber(120);
		Repository repo = new Repository();
		repo.addBuffer(10);
		repo.addBuffer(7);
		repo.addBuffer(4);
		repo.addBuffer(2);
		repo.addBuffer(6);
		repo.addBuffer(9);
		List<Integer> lista = new ArrayList<Integer>();
//		lista = repo.getFiltra(f);
		lista = repo.getFiltra(new Filter() {
			//l'ho fatto con ctrl+spazio
			@Override
			public boolean isFiltered(int numero) {
				return numero % 2 == 0;
			}
		});

		System.out.println(lista);

	}
}
