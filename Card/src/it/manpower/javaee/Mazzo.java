package it.manpower.javaee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazzo {
	private List<Card> mazzo = new ArrayList<>();

	public Mazzo() {
		for (int i = Card.MIN_VALUE; i <= Card.MAX_VALUE; i++) {
			for (Seme sem : Seme.values())
				mazzo.add(new Card(i, sem));
		}
	}
	
	public void mescola() {
		Collections.shuffle(mazzo);
	}
	public List<Card> getMazzo() {
		return mazzo;
	}
	
	public void print() {
		for(int i=0; i<mazzo.size(); i++) {
			System.out.print(mazzo.get(i).toString()+" ");
		}
		
	}
}
