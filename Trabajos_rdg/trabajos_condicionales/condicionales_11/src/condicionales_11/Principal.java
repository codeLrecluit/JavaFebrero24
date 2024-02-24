package condicionales_11;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opc;
		double costo;
		double peso;
		System.out.println("Elija el destino del paquete\n1.-America del Norte\n2.-America Central\n"
				+ "3.-America del Sur\n4.-Europa\n5.-Asia");
		opc= sc.nextInt();
		
		System.out.println("Ingrese el peso del paquete");
		peso = sc.nextDouble();
		
		if(peso>5) {
			System.out.println("No se puede enviar su paquete por exceso de peso");
		}else {
			switch(opc) {
				case 1:
					System.out.println("El costo total de envio es: "+peso*24+" euros");
					break;
				case 2:
					System.out.println("El costo total de envio es: "+peso*20+" euros");
					break;
				case 3:
					System.out.println("El costo total de envio es: "+peso*21+" euros");
					break;
				case 4:
					System.out.println("El costo total de envio es: "+peso*10+" euros");
					break;
				case 5:
					System.out.println("El costo total de envio es: "+peso*18+" euros");
					break;
			}
		}
	}

}
