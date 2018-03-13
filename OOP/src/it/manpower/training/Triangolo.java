package it.manpower.training;

public class Triangolo {
	private float lato1;
	//private int altezza;
	private float lato2;
	private float lato3;
	// costruttori

	public Triangolo(float lato1, float lato2, float lato3) {
		//setAltezza(altezza);
		setLati(lato1, lato2, lato3);
	}

	// Metodi

	/*public void setBase(float base) {
		if (base <= 0) {
			throw new RuntimeException("valori negativi non permessi");
		} else {
			this.lato1 = base;
		}
	}
	
	public void setAltezza(int altezza) {
		if (altezza <= 0) {
			throw new RuntimeException("valori negativi non permessi");
		} else {
			this.altezza = altezza;
		}
	}*/
	
	public void setLati(float lato1, float lato2, float lato3) {
		if (lato1 <= 0&&lato2<=0&&lato3<=0) {
			throw new RuntimeException("valori negativi non permessi");
		} else if(lato1+lato2<lato3 | lato1+lato3<lato2){
			throw new RuntimeException("triangolo non può esistere");
		} else {
			this.lato1=lato1;
			this.lato2= lato2;
			this.lato3=lato3;
		}
	}
	
	/*public int getAltezza() {
		return altezza;
	}
	public int getBase() {
		return lato1;
	}*/
	
	/**
	 * Inserire Maggiore o Minore a seconda 
	 * del cateto che si vuole stampare
	 * @param arg
	 * @return
	 */
	/*
	public int getCateto(String arg) {
		if(arg=="Maggiore") {
			return lato2;
		} else if(arg=="Minore") {
			return lato3;
		} else {
			throw new RuntimeException("Inserire Minore o Maggiore");
		}
	}on a*/
	
	public double getArea(){
		float p=getPerimetro()/2;
		return Math.sqrt(p*(p-lato1)*(p-lato2)*(p-lato3));
	}
	
	public float getPerimetro(){
		return lato1+lato2+lato3;
	}
	
	public String confrontaArea(Triangolo nuovoTriangolo) {
		double area=nuovoTriangolo.getArea();
		if (this.getArea()>area) {
			return "Il triangolo è più piccolo";
		} else if (this.getArea()==area){
			return "I triangoli sono uguali";
		} else {
			return "Il triangolo è più grande";	
		}
	}
		

}
