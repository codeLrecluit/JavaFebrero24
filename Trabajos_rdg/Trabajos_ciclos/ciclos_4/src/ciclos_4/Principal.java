package ciclos_4;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String frase,letra="";
		int contador=0;
		System.out.println("Ingrese una frase");
		frase = sc.next();
		System.out.println("Ingrese el caracter a buscar");
		letra = sc.next();
		for(int i=0; i<frase.length() ;i++) {
			if(frase.subSequence(i, i+1).equals(letra)) {
				contador++;
			}
		}
		if(contador>0) {
			System.out.println("El caracter "+letra+" fue encontrado "+ contador);
		}else {
			System.out.println("Caracter no encontrado");
		}
	}

}
