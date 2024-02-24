package condicionales_08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite un numero");
		num = sc.nextInt();
		
		if(num>6 || num<1) {
			System.out.println("ERROR: numero incorrecto");
		}else {
			switch(num) {
				case 1:
					System.out.println("SEIS");
					break;
				case 2:
					System.out.println("CINCO");
					break;
				case 3:
					System.out.println("CUATRO");
					break;
				case 4:
					System.out.println("TRES");
					break;
				case 5:
					System.out.println("DOS");
					break;
				case 6:
					System.out.println("UNO");
					break;
			}
		}
	}

}
