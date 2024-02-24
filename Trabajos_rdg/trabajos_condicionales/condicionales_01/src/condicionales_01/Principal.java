package condicionales_01;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Ingresar primer numero");
		num1 = sc.nextInt();
		System.out.println("Ingresar segundo numero");
		num2 =sc.nextInt();
		
		if(num1>num2) {
			System.out.println("El numero mayor es "+num1);
		}else if(num2>num1) {
			System.out.println("El numero mayor es "+num2);
		}else {
			System.out.println("Son numeros iguales");
		}
		
	}

}
