package it.manpower.esame;

public class Main {
	public static void main(String[] args) {
		Articolo art1 = new Articolo("Televisore", Categoria.Elettronica);
		Articolo art2 = new Articolo("Cappotto", Categoria.Abbigliamento);
		Articolo art3 = new Articolo("Pane", Categoria.Alimentari);
		Articolo art4 = new Articolo("Acqua", Categoria.Alimentari);
		Scontrino scont = new Scontrino();
		CalcoloPrezzo abb = new CalcoloPrezzoScontoAbbigliamento();
		CalcoloPrezzo ele = new CalcoloPrezzoScontoElettronica();
		
		
		scont.add(art1);
		scont.add(art2);
		scont.add(art3);
		scont.add(art4);
		
		System.out.println(scont.calcolaTotale(abb));
		System.out.println(scont.calcolaTotale(ele));
		

	}
}
