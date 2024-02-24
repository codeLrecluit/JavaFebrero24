package condicionales_03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Ingresar primer numero");
		num1 = sc.nextDouble();
		System.out.println("Ingresar segundo numero");
		num2 =sc.nextDouble();
		
		if(num2==0) {
			System.out.println("Error no se puede dividir entre cero");
		}else {
			System.out.println("El resultado es: "+num1/num2);
		}
	}

}
