package it.manpower.giovedi;

public class Primi implements Filter{
	
	public boolean isFiltered(int numero) {
		for(int i=2; i<numero; i++) {
			if(numero%i==0) {
				return true;
			}
		}
		return false;
			
	}
}
