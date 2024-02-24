package condicionales_10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite el numero del mes");
		num = sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("31 dias");
				break;
			case 2:
				System.out.println("28 o 29 segun el anyo");
				break;
			case 3:
				System.out.println("31 dias");
				break;
			case 4:
				System.out.println("30 dias");
				break;
			case 5:
				System.out.println("31 dias");
				break;
			case 6:
				System.out.println("30 dias");
				break;
			case 7:
				System.out.println("31 dias");
				break;
			case 8:
				System.out.println("31 dias");
				break;
			case 9:
				System.out.println("30 dias");
				break;
			case 10:
				System.out.println("31 dias");
				break;
			case 11:
				System.out.println("30 dias");
				break;
			case 12:
				System.out.println("31 dias");
				break;
		}
	}

}
