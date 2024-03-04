package Respuesta;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		int numero;
		Scanner reader = new Scanner(System.in);
		System.out.println("Escribe un numero");
		numero = reader.nextInt();
		parImpar(numero);
	}
	public static void parImpar(int numero) {
		numero = numero % 2;
		if(numero == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}
}

