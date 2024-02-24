package ciclos_2;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num, rango;
		System.out.println("Ingrese el numeros a multiplicar");
		num = sc.nextInt();
		System.out.println("Ingrese el numero repeticiones");
		rango = sc.nextInt();
		
		for(int i=1; i<=rango; i++) {
			System.out.println(num + " * "+i+" = "+num*i);
		}
		
	}

}
