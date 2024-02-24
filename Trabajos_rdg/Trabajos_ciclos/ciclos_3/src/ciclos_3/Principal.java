package ciclos_3;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cadena,cadena2="";
		boolean comparacion;
		System.out.println("Ingrese la cadena a comparar");
		cadena = sc.next();
		for(int i=cadena.length(); i>0; i--) {
			cadena2+=cadena.substring(i-1,i);
		}
		if(cadena.equals(cadena2)) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		
	}

}
