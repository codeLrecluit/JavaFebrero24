package Respuesta;

import java.util.Scanner;

public class Problema8 {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese el resultado del lanzamiento del dado (1-6):");
		numero = reader.nextInt();
		 if (numero < 1 || numero > 6) {
	            System.out.println("ERROR: número incorrecto.");
	        } else {
	            int opuesto = 7 - numero;
	            String opuestoEnLetras = numeroEnLetras(opuesto);
	            System.out.println("El opuesto es: " + opuestoEnLetras);
	        }
	}
	 private static String numeroEnLetras(int numero) {
	        switch (numero) {
	            case 1: 
	            	return "uno";
	            case 2: 
	            	return "dos";
	            case 3: 
	            	return "tres";
	            case 4: 
	            	return "cuatro";
	            case 5: 
	            	return "cinco";
	            case 6: 
	            	return "seis";
	            default: 
	            	return "Número fuera de rango";
	        }
	    }
}
