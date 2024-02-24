package ciclos_11;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alto,ancho;
		System.out.println("Ingresa el ancho del rectangulo");
		ancho= sc.nextInt();
		System.out.println("Ingresa el alto del rectangulo");
		alto =sc.nextInt();
		
		for (int i=0;i<alto;i++) {
			for(int j=0; j<ancho;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
