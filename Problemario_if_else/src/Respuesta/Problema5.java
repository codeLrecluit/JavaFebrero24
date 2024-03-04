package Respuesta;

import java.lang.reflect.AccessibleObject;
import java.util.Scanner;

public class Problema5 {
	public static void main(String[] args) {
		int nota, edad;
		char sexo;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Escribe tu nota");
		nota = reader.nextInt();
		
		System.out.println("Escribe tu edad");
		edad = reader.nextInt();
		
		System.out.println("Escribe tu se (M: masculino, F: Femenino)");
		sexo = reader.next().charAt(0);
		acceso(nota,edad,sexo);
	}
	public static void acceso(int nota, int edad, char sexo) {
		if(edad == 18 && nota == 5) {
			if(sexo=='M' || sexo=='m') {
				System.out.println("Posible aceptado");
			}else {
				System.out.println("Aceptada");
			}
		}else {
			System.out.println("No aceptad@");
		}
	}
}
