package condicionales_02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Ingresar un numero");
		num1 = sc.nextInt();
		
		if(num1%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}

}
