package it.manpower.trying;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		// if(a>5) {
		// a=5;
		// }else if(a<3){
		// a=3;
		// }
		// System.out.println(a);
		// boolean b=5>6;
		// System.out.println(b);
		float[] prezzo = new float[]{20, 75, 59, 16, 24, 
				28, 39, 48, 67, 80};
		float[] sconto = new float[10];
		if(a < 18 || a >= 65) {
			for(int i=0; i<10; i++) {
				sconto[i]=prezzo[i]-prezzo[i]*20/100;
				System.out.println(sconto[i]);
			}
			
		}

	}
}