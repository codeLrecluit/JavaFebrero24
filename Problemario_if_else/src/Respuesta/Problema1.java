package Respuesta;

import java.util.InputMismatchException;
import java.util.Scanner;

//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
public class Problema1 {
	public static void main(String[] args) {
		//Se inicializa el capturador de errores
		try {
			//Inicializo el objeto de la clase scanner
			Scanner reader = new Scanner(System.in);
			
			//Inicializo las dos variables
			int primerNumero, segundoNumero;
			
			System.out.println("Escriba el primero numero");
			
			//Leo el primero numero
			primerNumero = reader.nextInt();
			
			
			System.out.println("Escriba el segundo numero");
			//realizo la mis operacion que la linea 13 y 15
			segundoNumero = reader.nextInt();
			
			//Realizo la compracion si el primer numero es mayor que el segundo
			if(primerNumero > segundoNumero) {
				System.out.println("El numero mayor es " +primerNumero);
			}
			
			else {
			
				//realizo la misma operacion que la linea 21 pero viceversa 
				if(segundoNumero > primerNumero) {
					System.out.println("El numero mayor es " +segundoNumero);
				}
				
				//Si ninguno de los if anteriores regresa una respuesta verdadera ejecuta la sentencia que son iguales
				else {
					System.out.println("Los numeros son iguales");
				}
			
			}
			//Cierro el scanner para que no tenga warnings el programa
			reader.close();
		}
		/*
		 Si alguien escribe algun numero que no sea entero, se ejecutara lo que esta adentro del catch
		 despues finalizara el programa 
		*/
		catch(InputMismatchException ime){
			System.out.println("Este programa solo acepta numeros entero");
		}
		
	}
	
}
