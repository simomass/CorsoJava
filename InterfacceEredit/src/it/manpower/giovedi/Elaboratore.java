package it.manpower.giovedi;

public class Elaboratore {
	private Filter f;

	public void setF(Filter f) {
		this.f = f;
	}
	
	public void acceptNumber(int numero) {
		 if(f.isFiltered(numero)) {
			 System.out.println(numero);
		 }
	}	
}
