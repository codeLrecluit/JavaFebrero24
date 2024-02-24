package condicionales_04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cadena ="";
		int cont=0;
		System.out.println("Ingrese una cadena de texto");
		cadena = sc.next();
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.substring(i, i+1).equals(cadena.substring(i, i+1).toUpperCase())) {
				cont++;
			}
		}
		System.out.println("El numero de mayusculas que tiene la cadena es: "+cont);
	}

}
