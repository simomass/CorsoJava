package it.manpower.javaee;

public enum Seme {
	Quadri, Picche, Fiori, Cuori;

	/*
	 * private final String abbreviation;
	 * 
	 * private Seme (String abbreviation) { this.abbreviation = abbreviation;
	 * 
	 * }
	 * 
	 * public String getAbbreviation() { return abbreviation; }
	 */

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
