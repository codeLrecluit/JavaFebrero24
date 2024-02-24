package condicionales_09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite un numero");
		num = sc.nextInt();
		
		if(num>7 || num<1) {
			System.out.println("ERROR");
		}else {
			switch(num) {
				case 1:
					System.out.println("DOMINGO");
					break;
				case 2:
					System.out.println("LUNES");
					break;
				case 3:
					System.out.println("MARTES");
					break;
				case 4:
					System.out.println("MIERCOLES");
					break;
				case 5:
					System.out.println("JUEVES");
					break;
				case 6:
					System.out.println("VIERNES");
					break;
				case 7:
					System.out.println("SABADO");
					break;
			}
		}
	}

}
