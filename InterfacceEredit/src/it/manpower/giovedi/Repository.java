package it.manpower.giovedi;

import java.util.*;

public class Repository {

	private List<Integer> buffer = new ArrayList<Integer>();
	
	public void addBuffer(int value) {
		buffer.add(value);
	}
	
	public List<Integer> getFiltra(Filter f){
		List<Integer> newLista = new ArrayList<Integer>();
		for(int num : buffer) {
			if(f.isFiltered(num)) {
				newLista.add(num);
			}
		}
		return newLista;
	}
}