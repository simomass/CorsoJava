package it.manpower.training;

public class Main {
	public static void main(String[] args) {
		int[] vett = { 3, 56, 8, 9, 8, 7, 2, 5, 0, 1, 4 };

		Operation[] ops = new Operation[2];
		ops[0]= new Sum();
		ops[1] = new Mean();
		for(Operation o:ops) {
			System.out.println(o.compute(vett));
		}
	}
}
