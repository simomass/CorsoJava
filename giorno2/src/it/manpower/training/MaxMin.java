package it.manpower.training;

public class MaxMin {
	public static int max(int[] mioVettore) {
		int confronta=mioVettore[1];
		for(int elem:mioVettore) {
			if(confronta<elem) {
				confronta=elem;
			}
		}
		return confronta;
	}
	
	public static int min(int[] mioVettore) {
		int confronta=mioVettore[1];
		for(int elem:mioVettore) {
			if(confronta>elem) {
				confronta=elem;
			}
		}
		return confronta;
	}
	
	public static void main(String[] arg){
		int[] myVec= {5,7,5,2,4,8,9,12};
		System.out.println(max(myVec));
		System.out.println(min(myVec));
		System.out.println(secondo(myVec));
		
	}
	
	public static int secondo(int[] mioVettore) {
		int confronta=mioVettore[1];
		for(int elem:mioVettore) {
			if(confronta<elem&&elem!=max(mioVettore)) {
				confronta=elem;
			}
		}
		return confronta;
	}
}
