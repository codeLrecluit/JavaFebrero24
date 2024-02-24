package com;

public class Smartwatch extends Reloj{

	
	//Atributo extra (que lo especializa)
	String sensores;
	Pantalla pantalla;
	String sistemaOperativo;
	
	public Smartwatch() {
		
	}

	public Smartwatch(String materiales, String color, int minutos, int horas, String sensores, Pantalla pantalla,
			String sistemaOperativo) {
		super(materiales, color, minutos, horas);
		this.sensores = sensores;
		this.pantalla = pantalla;
		this.sistemaOperativo = sistemaOperativo;
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
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "Smartwatch [sensores=" + sensores + ", pantalla=" + pantalla + ", sistemaOperativo=" + sistemaOperativo
				+ "]";
	}
	
	
}
