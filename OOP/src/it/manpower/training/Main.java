package it.manpower.training;

public class Main {
	public static void main(String[] arg) {
		//Rectangle myRect = new Rectangle(5, 2);
		/*
		 * � un'espressione che crea un oggetto a partire da una classe e il valore
		 * ritornato da questa espressione � il riferimento all'oggetto appena creato
		 */
		// Rectangle myRect2 = myRect; /*non avendo usato
		// new non crea un nuovo oggetto*/
		//myRect.setHeight(4);
		//myRect.setWidth(4);
		//System.out.println(myRect.getArea());
		/* nel caso un oggetto debba essere utilizzato pi� volte conviene assegnarlo */
		//System.out.println(new Rectangle(3, 4).getArea());
		/*
		 * l'operatore punto viene applicato a una variabile che si riferisce ad un
		 * oggetto.
		 * 
		 */
		
		Triangolo mioTriangolo= new Triangolo(5,3,4);
		System.out.println(mioTriangolo.getPerimetro());
		System.out.println(mioTriangolo.getArea());
		Triangolo mioTriangolo2 = new Triangolo(6,3,5);
		System.out.println(mioTriangolo.confrontaArea(mioTriangolo2));
	}
}
