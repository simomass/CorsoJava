package it.manpower.pattern.adapter;

public class ParallelepipedoAdapter extends Parallelepipedo implements Forma {

	@Override
	public double getArea() {
		return super.calcolaArea();
	}

	@Override
	public double getPerimetro() {
		return super.calcolaPerimetro();
	}

}
