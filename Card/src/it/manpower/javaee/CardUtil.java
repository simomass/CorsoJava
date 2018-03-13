package it.manpower.javaee;

public class CardUtil {
	
	public static int compara(Card Carta1, Card Carta2) {
			return Carta1.getNum()-Carta2.getNum();
//			if(valore<0){
//				return "La prima carta ha un valore più basso";
//			} else if(valore>0) {
//				return "La prima carta ha un valore più alto";
//			} else {
//				return "Hanno lo stesso numero";
//			}
	}
	public static boolean isStessoSeme(Card Carta1, Card Carta2) {
		return Carta1.getSeme() == Carta2.getSeme();
		/*if(Uguali) {
			return "Hanno lo stesso seme";			
		} else {
			return "Hanno diverso seme";			
		}*/
	}
}
