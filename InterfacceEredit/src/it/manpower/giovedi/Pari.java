package it.manpower.giovedi;

public class Pari implements Filter{

	public boolean isFiltered(int numero) {
		return numero%2==0;
	}
}
