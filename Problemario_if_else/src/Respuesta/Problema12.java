package Respuesta;

import java.util.Scanner;

public class Problema12 {
	public static void main(String[] args) {
		double masaCorporal, peso, altura, resultado;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingrese el peso en kg.");
		peso = reader.nextDouble();
		
		System.out.println("Ingrese la altura en m.");
		altura = reader.nextDouble();
		
		resultado = peso / (altura*altura);
		
		System.out.println(diagnostico(resultado));
	}
	public static String diagnostico (double resultado) {
		if(resultado < 16) {
			return "Criterio de ingreso en hospital";
		}
		else if(resultado > 16 && resultado < 17) {
			return "Inflapeso";
		}
		else if(resultado > 17 && resultado < 18) {
			return "Bajo peso";
		}
		else if(resultado > 18 && resultado < 25) {
			return "Peso normal (saludable)";
		}
		else if(resultado > 25 && resultado < 30) {
			return "Sobrepeso (obesidad de grado I)";
		}
		else if(resultado > 30 && resultado < 35) {
			return "Sobrepeso crónico (obesidad de grado II)";
		}
		else if(resultado > 35 && resultado < 40) {
			return "Obesidad premórbida (obesidad de grado III)";
		}
		else {
			return "Obesidad mórbida (obesidad de grado IV)";
		}
	}
}
