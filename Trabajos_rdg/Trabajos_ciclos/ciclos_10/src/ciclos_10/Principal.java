package ciclos_10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[20];
		String cpar="",cp="";
		int spos=0,simpar=0;
		for (int i=0; i<20;i++) {
			numeros[i]=sc.nextInt();
		}
		for(int i=0; i<20;i++) {
			if(numeros[i]>0) {
				cp="positivo";
				spos+=numeros[i];
			}else {
				cp="negativo";
			}
			if(numeros[i]%2==0) {
				cpar="par";
			}else {
				cpar="impar";
				simpar+=numeros[i];
			}
			System.out.println("EL numero "+ numeros[i]+" es "+cp+" y "+cpar);
		}
		System.out.println("La sumatoria de los numeros positivos es: "+spos);
		System.out.println("La sumatoria de los numeros impares es: "+simpar);

	}

}
