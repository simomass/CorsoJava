package it.manpower.training;

public class Mean implements Operation {

	@Override
	public double compute(int[] myArray) {
		double media=0;
		if(myArray.length==0) {
			throw new IllegalArgumentException("Array nullo");
		}
		
		for (int calc : myArray) {
			media += calc;
		}
		return media / myArray.length;
	}
}
