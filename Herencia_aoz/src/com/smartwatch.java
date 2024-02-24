package com;

public class smartwatch  extends Reloj{
	
	String sensores; 
	Pantalla pantalla;
	String SistemaOperativo;
	
	public smartwatch() {
		
	}

	public smartwatch(String materiales, String color, int minutos, int horas, String sensores, Pantalla pantalla,
			String sistemaOperativo) {
		super(materiales, color, minutos, horas);
		this.sensores = sensores;
		this.pantalla = pantalla;
		SistemaOperativo = sistemaOperativo;
	}

	public String getSensores() {
		return sensores;
	}

	public void setSensores(String sensores) {
		this.sensores = sensores;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public String getSistemaOperativo() {
		return SistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "smartwatch [sensores=" + sensores + ", pantalla=" + pantalla + ", SistemaOperativo=" + SistemaOperativo
				+ "]";
	}
	
	
}
