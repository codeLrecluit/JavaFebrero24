package Respuesta;

import java.util.Scanner;

public class Problema9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese el dia de la semana (del 1 al 7)");
		numero = reader.nextInt();
		System.out.println(numeroSemana(numero));
	}
	private static String numeroSemana(int numero) {
        switch (numero) {
            case 1: 
            	return "Lunes";
            case 2: 
            	return "Martes";
            case 3: 
            	return "Miercoles";
            case 4: 
            	return "Jueves";
            case 5: 
            	return "Viernes";
            case 6: 
            	return "Sabano";
            case 7: 
            	return "Domingo";
            default: 
            	return "Número fuera de rango";
        }
    }
}
