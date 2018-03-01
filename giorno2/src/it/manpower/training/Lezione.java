package it.manpower.training;

//Esercizio 4
public class Lezione {
	public static void main(String[] arg) {
			/*int x=3;
 			x=increment(x);
 			System.out.println("il valore è: " +x);*/
		int a=5;
		int conta=0;
		for(int i=0; i<=a; i++) {
			conta=conta+i;
		}
		System.out.println(conta);
		tabellina(7); 			
	}
		public static void tabellina(int z) {
			int[] myVec={1,2,3,4,5,6,7,8,9,10};
			int[] result=new int[10];
			for(int i=0; i<10; i++) {
				result[i]=myVec[i]*z;
				System.out.println(result[i]);
			}
			
		}
		
}
