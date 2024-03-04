package Respuesta;

import java.util.Scanner;

public class Problema14 {
	public static void main(String[] args) {
		int horasTrabajadas;
		int horasextras;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese el numero de horas trabajadas de la semana");
		horasTrabajadas = reader.nextInt();
		if(horasTrabajadas <= 40) {
			System.out.println("El ingreso es de $"+(horasTrabajadas * 16));
		}
		else {
			horasextras = horasTrabajadas - 40;
			System.out.println("El ingreso es de $"+((40 * 16)+(horasextras * 20)));
		}
	}
}
