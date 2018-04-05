package it.manpower.esame;

public class CalcoloPrezzoScontoAbbigliamento implements CalcoloPrezzo{

	@Override
	public int ottieniPrezzo(Articolo a) {
		if(a.getCategoria()==Categoria.Elettronica) {
			return 500;
		} else if(a.getCategoria()==Categoria.Alimentari) {
			return 10;
		}
		return 30;
	}
	
}
