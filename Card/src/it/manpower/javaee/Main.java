package it.manpower.javaee;

import java.util.Collections;

public class Main {
	public static void main(String[] arg) {
//		Card Carta = new Card(7, Seme.Quadri);
//		Card AltraCarta = new Card(8, Seme.Quadri);

		//System.out.println(CardUtil.isStessoSeme(Carta, AltraCarta));

		Mazzo boh = new Mazzo();
//		boh.mescola();
//		boh.print();
		Collections.sort(boh.getMazzo());
		System.out.print(boh.getMazzo());
		
	}
}
