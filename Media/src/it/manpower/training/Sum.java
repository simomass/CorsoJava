package it.manpower.training;

public class Sum implements Operation {

	@Override
	public double compute(int[] myArray) {
		double somma = 0;
		for (int count : myArray) {
			somma += count;
		}
		return somma;
	}

}
