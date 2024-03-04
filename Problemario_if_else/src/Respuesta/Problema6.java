package Respuesta;

import java.util.Scanner;

public class Problema6 {
public static void main(String[] args) {
	int precioUva;
	int pesoUvan;
	char tipoUva;
	int tamañoUva;
	
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Escribe el precio de la uva ");
	precioUva = reader.nextInt();
	
	System.out.println("Escribe los kilos de la uva ");
	pesoUvan = reader.nextInt();
	
	System.out.println("Escribe el tipo de la uva (A o B)");
	tipoUva = reader.next().charAt(0);
	
	System.out.println("Escribe el tamaño de la uva (1 o 2)");
	tamañoUva = reader.nextInt();
	
	precioUva += clasificacionUva(tamañoUva, tipoUva);
	
	System.out.println("El precio de la uva por kilo es de $"+precioUva+"\n El precio total seria $"+(precioUva*pesoUvan));
}
public static int clasificacionUva(int tamaño, char tipo) {
	if(tipo =='A') {
		if(tamaño == 1) {
			 return 20;
		}
		else {
			return 30;
		}
	}
	else {
		if(tamaño == 1) {
			 return 30;
		}
		else {
			return 50;
	}
	

}

}
}
