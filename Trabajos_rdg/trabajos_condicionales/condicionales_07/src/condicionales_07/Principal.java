package condicionales_07;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alumnos;
		float cpa;
		System.out.println("Ingrese el numero de alumnos");
		alumnos = sc.nextInt();
		
		if(alumnos>= 100) {
			System.out.println("El pago total a la companya es de: "+alumnos*65+" euros y cada alumno paga 65 euros");
		}else if(alumnos>=50 && alumnos <=99) {
			System.out.println("El pago total a la companya es de: "+alumnos*70+" euros y cada alumno paga 70 euros");
		}else if(alumnos>=30 && alumnos<=49) {
			System.out.println("El pago total a la companya es de: "+alumnos*95+" euros y cada alumno paga 95 euros");
		}else {
			System.out.println("El pago total a la companya es de: 4000 euros y cada alumno paga "+4000/alumnos+" euros");
		}
	}

}
