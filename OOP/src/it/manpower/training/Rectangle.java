package it.manpower.training;

public class Rectangle {
	// campi
	private int width;
	private int height;

	// costruttori
	public Rectangle(int width, int height) {
		//	if (width <= 0 || height <= 0) {
		//		throw new RuntimeException("valori negativi non permessi");
		//	} /*
		//		 * questo funziona perché i campi sono private, se fossero public potrei
		//		 * modificarli con il punto e mettere valori negativi->importanza
		//		 * dell'incapsulamento
		//		 */
		//	this.width = width;
		//	this.height = height;
		setWidth(width);
		setHeight(height);
	}

	// metodi
	/*
	 * I metodi accessori permettono di interagire con lo stato possono essere
	 * getter o setter.
	 */
	/**
	 * Help dell'oggetto
	 * 
	 * @return
	 */
	public void setHeight(int height) {
		if (height <= 0) {
			throw new RuntimeException("valori negativi non permessi");
		} else {
			this.height = height; //siccome sia il campo della classe che
			//il parametro hanno lo stesso nome, si usa width
			//vuol dire "riferisciti all'oggetto istanza corrente"
			//è un'espressione che ritorna come valore il riferimento
			//all'istanza dell'oggetto corrente
		}
	}

	public void setWidth(int width) {
		if (width <= 0) {
			throw new RuntimeException("valori negativi non permessi");
		} else {
			this.width = width;
		}
	}
	
	public int getWidth() {
		return width;
	}

	/* Il campo Width è in lettura e scrittura
	 *
	 * */
	
	public int getArea() {
		return width * height;
	}

	public int getPerimeter() {
		return width + height * 2;
	}
}