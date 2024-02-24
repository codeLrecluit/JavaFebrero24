package ciclos_12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,cont=1;
		double promedio=0.0,suma=0;
		while(promedio<25) {
			System.out.println("Agrega un numero");
			num=sc.nextInt();
			suma+=num;
			promedio=suma/cont;
			cont++;
			System.out.println("El promedio actual es "+ promedio);
		}

	}

}
