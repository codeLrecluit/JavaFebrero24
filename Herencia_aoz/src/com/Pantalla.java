package com;

public class Pantalla {
	
	String tipoPanel;
	int tasaActualizacion;
	String resolucion;
	double tamaño;
	
	 public Pantalla() {
		 
	 }

	public Pantalla(String tipoPanel, int tasaActualizacion, String resolucion, double tamaño) {
		super();
		this.tipoPanel = tipoPanel;
		this.tasaActualizacion = tasaActualizacion;
		this.resolucion = resolucion;
		this.tamaño = tamaño;
	}

	public String getTipoPanel() {
		return tipoPanel;
	}

	public void setTipoPanel(String tipoPanel) {
		this.tipoPanel = tipoPanel;
	}

	public int getTasaActualizacion() {
		return tasaActualizacion;
	}

	public void setTasaActualizacion(int tasaActualizacion) {
		this.tasaActualizacion = tasaActualizacion;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Pantalla [tipoPanel=" + tipoPanel + ", tasaActualizacion=" + tasaActualizacion + ", resolucion="
				+ resolucion + ", tamaño=" + tamaño + "]";
	}
	 
	 

}
