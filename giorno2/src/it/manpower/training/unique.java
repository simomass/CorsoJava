package it.manpower.training;

public class unique {
	public static int[] unico(int[] mioVettore) {
		int[] vettRight = new int[mioVettore.length];
		for (int i = 0; i < mioVettore.length; i++) {
			int conta = 0;
			for (int uniq : mioVettore) {
				if (mioVettore[i] == uniq) {
					conta++;
				}
			}
			if (conta <= 1) {
				vettRight[i] = (mioVettore[i]);
			}
		}
		return vettRight;
	}

	public static void main(String[] arg) {
		int[] myVec = { 5, 7, 5, 2, 4, 8, 9, 12 };
		int[] vett2 = unico(myVec);
		for (int uscita : vett2) {
			if (uscita > 0) {
				System.out.println(uscita);
			}

		}

	}
}
