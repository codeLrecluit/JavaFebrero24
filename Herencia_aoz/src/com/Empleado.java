package com;

public class Empleado extends Persona {
	
	String nombreEmpresa;
	Direccion direccion;
	int numeroEmpleado;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String apellidos, int edad, String nombreEmpresa, Direccion direccion,
			int numeroEmpleado) {
		super(nombre, apellidos, edad);
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + ", numeroEmpleado="
				+ numeroEmpleado + "]";
	}

	
}
