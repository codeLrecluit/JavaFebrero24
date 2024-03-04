package Respuesta;

import java.util.Scanner;

public class Problema3 {
public static void main(String[] args) {
	int numerador, divisor;
	Scanner reader = new Scanner(System.in);
	System.out.println("Escribe un numerador");
	numerador = reader.nextInt();
	System.out.println("Escribe un divisor");
	divisor = reader.nextInt();
	division(numerador,divisor);
	
}

public static void division(int numero1, int numero2) {
	if(numero2 == 0) {
		System.out.println("El divisor es un 0 y no se puede dividir entre 0");
	}else {
	double total;
	total = numero1/numero2;
	System.out.println("El resultado es: "+total);
	}
}
}
