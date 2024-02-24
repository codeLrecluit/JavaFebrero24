package Clase1_1;

public class principal {
public static void main(String[] args) {
	Conversor c = new Conversor();
	c.leerArchivo("fechas.txt");
	c.convertirFecha();
	c.escritura("fechasL.txt");
}
}
