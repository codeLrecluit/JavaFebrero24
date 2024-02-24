package ciclos_7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		float dinero =700;
		while(dinero<1500) {
			contador++;
			dinero=(float) (dinero*1.02);
		}
		System.out.println("Necesitas "+contador+" meses para tener mas de 1500");

	}

}
