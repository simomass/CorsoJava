package giorno3;

public class PariDispari {
	/*public static void pari(int[] myVec) {
		for (int numero : myVec) {
			if (numero % 2 == 0) {
				System.out.println("Pari");
			} else {
				System.out.println("Dispari");
			}
			// return numero;
		}
		// return 0;
	}*/

	public static int[] parivett(int[] myVec) {
		int zeriOrigin=0;
		for(int i=0; i<myVec.length;i++) {
			if(myVec[i]==0) {
				zeriOrigin++;
			}
		}
		int[] vettRight = new int[myVec.length];
		for (int i = 0; i < myVec.length; i++) {
			if (myVec[i] % 2 == 0) {
				vettRight[i] = myVec[i];
			}
		}
		int contaZeri=0;
		for(int i=0; i<vettRight.length;i++) {
			if(vettRight[i]!=0) {
				contaZeri++;
			}
		}
		int[] vettSenzaZeri=new int[contaZeri+zeriOrigin];
		int flag=0;
		for(int i=0; i<vettRight.length;i++) {
			if(vettRight[i]!=0) {
				vettSenzaZeri[i-flag]=vettRight[i];
			} else {
				flag++;
			}
		}
		//gli zeri sono quelli che mancano dal conto, non bello ma funziona
		return vettSenzaZeri;
		//System.out.println(contaZeri);
		//System.out.println(vettSenzaZeri.length);
	}

	public static void main(String[] arg) {
		int[] mioVettore = { 1, 2, 3, 4, 54, 6, 0, 7, 8, 5, 2, 0, 0, 85, 41, 1, 6, 56, 8 };
		// pari(mioVettore);
		int[] nuovoVett= parivett(mioVettore);
		for (int i = 0; i < nuovoVett.length; i++) {
			System.out.println(nuovoVett[i]);
		}
	}
}