package Respuesta;

import java.util.Scanner;

public class Problema10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese el numero del mes (del 1 al 12)");
		numero = reader.nextInt();
		System.out.println(numeroSemana(numero));
	}
	private static String numeroSemana(int numero) {
        switch (numero) {
            case 1: 
            	return "31 dias";
            case 2: 
            	return "28 dias";
            case 3: 
            	return "31 dias";
            case 4: 
            	return "30 dias";
            case 5: 
            	return "31 dias";
            case 6: 
            	return "30 dias";
            case 7: 
            	return "31 dias";
            case 8: 
            	return "31 dias";
            case 9: 
            	return "30 dias";
            case 10: 
            	return "31 dias";
            case 11: 
            	return "30 dias";
            case 12: 
            	return "31 dias";
            default: 
            	return "Número fuera de rango";
        }
    }
}
