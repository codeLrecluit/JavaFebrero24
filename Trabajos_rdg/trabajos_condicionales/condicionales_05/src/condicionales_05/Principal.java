package condicionales_05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad,nota;
		char sexo;
		edad=17;
		nota=5;
		sexo='F';
		
		if((edad>=18) && nota>=5 && sexo=='M') {
			System.out.println("Posible");
		}else if((edad>=18) && nota>=5 && sexo=='F') {
			System.out.println("Aceptada");
		}else {
			System.out.println("No aceptada");
		}

	}

}
