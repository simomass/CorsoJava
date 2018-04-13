package it.manpower.esame;

import java.sql.Date;

public class Prenotazione {
	private int id;
	private int id_cliente;
	private int id_auto;
	private Date from;
	private Date to;
	
	
	public Prenotazione(int id, int id_cliente, int id_auto, Date from, Date to) {
		this.id = id;
		this.id_cliente = id_cliente;
		this.id_auto = id_auto;
		this.from = from;
		this.to = to;
	}
	public int getId() {
		return id;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public int getId_auto() {
		return id_auto;
	}
	public Date getFrom() {
		return from;
	}
	public Date getTo() {
		return to;
	}
	
}
