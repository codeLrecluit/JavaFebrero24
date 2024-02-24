package condicionales_12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float peso,altura,IMC;
		System.out.println("Ingrese tu altura");
		altura=sc.nextFloat();
		System.out.println("Ingrese tu peso");
		peso=sc.nextFloat();
		
		IMC=peso/(altura*altura);
		
		System.out.println("Su IMC es: "+IMC);
		if(IMC<16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if(IMC>=16 && IMC<17) {
			System.out.println("Infrapeso");
		}else if(IMC>=17 && IMC<18) {
			System.out.println("Bajo de peso");
		}else if(IMC>=18 && IMC<25) {
			System.out.println("Peso normal (Saludable)");
		}else if(IMC>=25 && IMC<30) {
			System.out.println("Sobrepeso(Obesidad grado I)");
		}else if(IMC>=30 && IMC<35) {
			System.out.println("Sobrepeso crónico (Obesidad grado II)");
		}else if(IMC>=35 && IMC<40) {
			System.out.println("Obesidad premórbida (Obesidad grado III)");
		}else if(IMC>=40) {
			System.out.println("Obesidad mórbida (Obesidad grado IV)");
		}

	}

}
