package Respuesta;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int destino;
		double peso;
		System.out.println("Ingrese el numero del destino \n 1 América del Norte"
				+ "\n 2 América Central"
				+ "\n 3 América del Sur"
				+ "\n 4 Europa"
				+ "\n 5 Asia");
		destino = reader.nextInt();
		
		System.out.println("Ingrese el peso del paquete");
		peso = reader.nextDouble();
		
		destino = precioDesnito(destino);
		if(destino == 0 || peso <= 0  || peso > 5) {
			System.out.println("Numero del destino incorrecto o el peso del paquete no adecuado");
		}
		else {
			System.out.println("Costo del envio es de $"+(destino*peso));
		}
	}
	private static int precioDesnito(int numero) {
        switch (numero) {
            case 1: 
            	return 24;
            case 2: 
            	return 20;
            case 3: 
            	return 21;
            case 4: 
            	return 10;
            case 5: 
            	return 18;
            default: 
            	return 0;
        }
    }
}
