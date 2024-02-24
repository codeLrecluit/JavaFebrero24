package com;

public class Direccion {
	
	String estado;
	String municipio;
	String Colonia;
	String calle;
	int numero;
	
	public Direccion() {
		
	}

	public Direccion(String estado, String municipio, String colonia, String calle, int numero) {
		super();
		this.estado = estado;
		this.municipio = municipio;
		Colonia = colonia;
		this.calle = calle;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getColonia() {
		return Colonia;
	}

	public void setColonia(String colonia) {
		Colonia = colonia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [estado=" + estado + ", municipio=" + municipio + ", Colonia=" + Colonia + ", calle=" + calle
				+ ", numero=" + numero + "]";
	}
	
	

}
