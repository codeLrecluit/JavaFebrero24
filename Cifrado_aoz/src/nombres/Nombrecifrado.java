package nombres;

import java.util.Scanner;
public class Nombrecifrado {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String nombreyedad;
	  
	  System.out.println("Ingresa tu nombre y edad" );
      nombreyedad = scanner.nextLine();
      
      
      
      String nombre = "";
      String edadS = "";
      for (int i = 0; i < nombreyedad.length(); i++) {
          char c = nombreyedad.charAt(i);
          if (Character.isLetter(c)) {
              nombre += c;
          } else if (Character.isDigit(c)) {
              edadS += c;
          }
      }
      
      int edad = Integer.parseInt(edadS);
      
      char[] nombreEncriptado = new char[nombre.length()];
      for (int i = 0; i < nombre.length(); i++) {
          char c = nombre.charAt(i);
          if (Character.isLetter(c)) {
              if (c == 'z') {
                  nombreEncriptado[i] = 'a';
              } else if (c == 'Z') {
                  nombreEncriptado[i] = 'A';
              } else {
                  nombreEncriptado[i] = (char) (c + 1);
              }
          } else {
              nombreEncriptado[i] = c;
          }
      }
      
      String edadEncriptada = "";
      for (int i = 0; i < edadS.length(); i++) {
          char c = edadS.charAt(i);
          if (c == '9') {
              edadEncriptada += '0';
          } else {
              edadEncriptada += (char) (c + 1);
          }
      }
      
      System.out.print("Nombre encriptado: ");
      for (char c : nombreEncriptado) {
          System.out.print(c);
      }
      System.out.println();

      System.out.println("Edad encriptada: " + edadEncriptada);
      
      
  }
}
