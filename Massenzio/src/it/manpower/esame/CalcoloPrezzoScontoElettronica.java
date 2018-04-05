package it.manpower.esame;

public class CalcoloPrezzoScontoElettronica implements CalcoloPrezzo{
	
	@Override
	public int ottieniPrezzo(Articolo a) {
		if(a.getCategoria()==Categoria.Elettronica) {
			return 350;
		} else if(a.getCategoria()==Categoria.Alimentari) {
			return 10;
		}
		return 50;
	}
}
