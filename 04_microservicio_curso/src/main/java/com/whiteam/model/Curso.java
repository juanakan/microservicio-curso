package com.whiteam.model;

public class Curso {
	
	private String denominacion;
	private int duracion;
	private String tematica;
	
	public Curso() {

	}

	public Curso(String denominacion, int duracion, String tematica) {
		super();
		this.denominacion = denominacion;
		this.duracion = duracion;
		this.tematica = tematica;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	
	
	
	

}
