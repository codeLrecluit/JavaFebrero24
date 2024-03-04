package Respuesta;

import java.util.Iterator;
import java.util.Scanner;

public class Problema4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String palabra;
		boolean bandera = false;
		
		System.out.println("escribe una palabra");
		palabra = reader.nextLine();
		
		for (int i = 0; i < palabra.length(); i++) {
			if(Character.isUpperCase(palabra.charAt(i)))
			System.out.println(palabra.charAt(i) + " es una mayuscula");
			bandera = true;
		}
		
		if(bandera) {
			System.out.println("Tiene letra(s) mayuscula(s)");
		}else {
			System.out.println("No hay ninguna letra");
		}
	}
}
