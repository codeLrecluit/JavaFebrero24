package Respuesta;

import java.util.Scanner;

public class Problema7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int cantidadAlumnos;
		
		System.out.println("Escribe cuantos alumnos iran al viaje de estudios");
		cantidadAlumnos = reader.nextInt();
		
		if(cantidadAlumnos >= 100) {
			System.out.println("$65 por alumno y el total es de $"+(65*cantidadAlumnos));
		}
		else if(cantidadAlumnos >= 50 && cantidadAlumnos <= 99 ) {
			System.out.println("$70 por alumno y el total es de $"+(70*cantidadAlumnos));
		}
		else if(cantidadAlumnos >= 30 && cantidadAlumnos <= 49 ) {
			System.out.println("$95 por alumno y el total es de $"+(95*cantidadAlumnos));
		}
		else {
			System.out.println("$"+(4000/cantidadAlumnos)+" por alumno y el total es de $4000");
		}
		
	}
}
