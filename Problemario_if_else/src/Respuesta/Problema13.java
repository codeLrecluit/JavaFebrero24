package Respuesta;

import java.util.Scanner;

public class Problema13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double donacion;
		System.out.println("Escribe la donacion que recibio el instatuto");
		donacion = reader.nextDouble();
		
		if(donacion >= 10000) {
			System.out.println("Centro de salud $"+(0.30*donacion)+"\nComedor de niños $"+(0.50*donacion)+"\nInversion a la bolsa $"+(0.20*donacion));
		}
		else {
			System.out.println("Centro de salud $"+(0.25*donacion)+"\nComedor de niños $"+(0.60*donacion)+"\nInversion a la bolsa $"+(0.15*donacion));
		}
	}
}
