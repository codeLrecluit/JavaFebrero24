package condicionales_14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int horas=50,sueldo;
		
		if(horas>40) {
			sueldo = 40*16;
			sueldo+=(horas-40)*20;
		}else {
			sueldo=horas*16;
		}
		System.out.println("El sueldo total es de: "+ sueldo);
	}

}
