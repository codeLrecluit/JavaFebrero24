package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Cifrado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre completo y edad");
		String nombre = sc.nextLine();	
		//Normalizar todo a minusculas
		nombre = nombre.toLowerCase();
		//Determino el tamaño del array de resultados basado en la longitud de la cadena
		String caracter="";
		String[] cifrado = new String[nombre.length()];
		String numeros = "1234567890";
		String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q",
				"r","s","t","u","v","w","x","y","z"};			
		//Extraer los caracteres del String, colocare en un array
		for (int i = 0; i < nombre.length(); i++) {
			
			//Aislo el caracter actual
			 caracter = Character.toString(nombre.charAt(i));			 
			 //Filtro si es un espacio en blanco...
			 if(caracter.equals(" ")) {
				 cifrado[i] = "-";
			 }else if(numeros.indexOf(caracter)>=0) { //filtro si es un numero ...
				 //something...
				 //cifrado[i] = Integer.parseInt(caracter)+1+"";
				 if(numeros.indexOf(caracter)==8) {
					 cifrado[i] = "0";
				 }else{
					 cifrado[i] = Integer.parseInt(caracter)+1+"";
				 }				 
			 }else if(caracter.equals("z")){ //filtro si es la z ...
				 cifrado[i] = "a";
			 }else { //si no, entonces es una letra entre la a y la y				 
				 for (int j = 0; j < abc.length; j++) {					 
					if(abc[j].equals(caracter)) {
						cifrado[i] = abc[j+1];
					}
				}
			 }					
		}		
		System.out.println(Arrays.toString(cifrado));		
	}
}