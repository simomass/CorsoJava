package it.manpower.universita;

public class Main {
	public static void main(String[] args) {
		Corso organica = new Corso("Chimica Organica", 6);
		Esame chimicaOrganica = new Esame(25, false, organica);
		Studente simone = new Studente("Simone", "Massenzio", "6055562");
		simone.addEsami(chimicaOrganica);
		Corso analisi = new Corso("Analisi Matematica", 12);
		Esame analisiMatematica = new Esame(30, false, analisi);
		simone.addEsami(analisiMatematica);
		stampaLibretto(simone);
		}
	
	public static void stampaLibretto(Studente studente) {
		System.out.println(studente.getNome()+" "+studente.getCognome()+" "+studente.getMatricola());
		for(Esame dati:studente.getEsami()) {
			if(dati!=null) {
				System.out.println(dati.getVoto());
				System.out.println(dati.getLode());
				System.out.println(dati.getCorso().getNome());
				System.out.println(dati.getCorso().getCrediti());
			}
	}
	
//	public static void main(String[] arg) {
//		System.out.println(simone.);
//	}
//	
}
}
