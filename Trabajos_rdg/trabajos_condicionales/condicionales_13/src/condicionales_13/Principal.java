package condicionales_13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float donacion;
		System.out.println("Ingrese el monto de la donacion");
		donacion= sc.nextFloat();
		
		if(donacion >=10000) {
			System.out.println("Centro de salud: "+donacion*.30);
			System.out.println("Comedor infantil: "+donacion*.50);
			System.out.println("Inversionen bolsa: "+donacion*.20);
		}else {
			System.out.println("Centro de salud: "+donacion*.25);
			System.out.println("Comedor infantil: "+donacion*.60);
			System.out.println("Inversionen bolsa: "+donacion*.15);
		}
	}

}
