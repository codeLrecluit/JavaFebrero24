package condicionales_06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kilos,precio;
		
		System.out.println("Ingrese el precio original de la uva");
		precio=sc.nextInt();
		System.out.println("Ingrese el numero de kilos");
		kilos=sc.nextInt();
		
		System.out.println("Si la uva es tipo A y tamanyo 1 su precio ganancia total es de: "+(precio+20)*kilos);
		System.out.println("Si la uva es tipo A y tamanyo 2 su precio ganancia total es de: "+(precio+30)*kilos);
		System.out.println("Si la uva es tipo B y tamanyo 1 su precio ganancia total es de: "+(precio-30)*kilos);
		System.out.println("Si la uva es tipo B y tamanyo 2 su precio ganancia total es de: "+(precio-50)*kilos);
		

	}

}
