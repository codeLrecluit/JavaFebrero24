package Clase1;

public class principal {
 public static void main(String[] args) {
	Conversor c = new Conversor();
	c.leerArchivo("fechas.txt");
	c.convertirFecha();
	c.escribirFechas("fechasL.txt");
}

}
