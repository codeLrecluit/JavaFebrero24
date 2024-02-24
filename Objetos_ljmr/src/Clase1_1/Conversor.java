package Clase1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Conversor {
	String datos[];
	int contador;
	public Conversor() {
		
	}
	public int contarLineas(String ruta) {
		File file = new File(ruta);
		contador = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);			
			while ((br.readLine()) != null) {
				contador++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contador;
	}
	
	public void leerArchivo(String ruta) {
		File file = new File(ruta); 
		String linea = "";
		datos = new String[contarLineas(ruta)];
		contador = 0;
		
		try{
			FileReader fr = new FileReader(file); //pasamos el archivo al cache
			BufferedReader br = new BufferedReader(fr); //leemos el cache
			while((linea = br.readLine()) != null) {
				datos[contador] = linea;
				contador ++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void convertirFecha() {
		String[] dias = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno"};
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		int dia, mes, año;
		String linea;
		for (int i = 0; i < datos.length; i++) {
			linea = datos[i];
			try {
				dia = Integer.parseInt(linea.charAt(0)+""+linea.charAt(1));
				mes = Integer.parseInt(linea.charAt(2)+""+linea.charAt(3));
				año = Integer.parseInt(linea.charAt(4)+""+linea.charAt(5)+""+linea.charAt(6)+""+linea.charAt(7));
				System.out.println(dia);
				System.out.println(mes);
				System.out.println(año);
				if(mes == 2 && dia > 28) {
					System.out.println(dias[99]);
				} else if((mes == 4 || mes == 6 || mes == 9 || mes == 11)  && dia > 30 ) {
					System.out.println(dias[99]);
				}
				datos[i] = "Fecha :"+dias[dia-1]+" de "+meses[mes-1]+" de "+año+"\n";
				
				
			} catch (Exception e) {
				datos[i] ="Fecha invalida \n";
				
			}	
		}
		
	}
	public void escritura(String ruta) {
		File file = new File(ruta); 
		
		try{
			FileWriter fw = new FileWriter(file,false); 
			for (int i = 0; i < datos.length; i++) {
				fw.write(datos[i]);
			}
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
