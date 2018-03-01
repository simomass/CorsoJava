package it.manpower.training;

//fattoriale
public class esercizi2 {
	public static int fact(int z) {
		if(z==0) {
			return 1;
		}
		int conta=1;
		for(int i=1; i<=z; i++) {
			conta=conta*i;
		}
		return conta;
	}
	
	public static void main(String[] arg) {
		System.out.println(fact(10));

		//return conta;
		//System.out.println(conta);
	}
}