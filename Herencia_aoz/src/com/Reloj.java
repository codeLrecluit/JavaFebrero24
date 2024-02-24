package com;

public class Reloj {
	
	String materiales;
	String color;
	int minutos;
	int horas;
	public Reloj() {
		
	}
	public Reloj(String materiales, String color, int minutos, int horas) {
		super();
		this.materiales = materiales;
		this.color = color;
		this.minutos = minutos;
		this.horas = horas;
	}
	public String getMateriales() {
		return materiales;
	}
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Reloj [materiales=" + materiales + ", color=" + color + ", minutos=" + minutos + ", horas=" + horas
				+ "]";
	}
	
	public void mostrar() {
		System.out.println("Manecilla de horas" + horas);
		System.out.println("Manecilla de horas" + minutos);
	}

}
