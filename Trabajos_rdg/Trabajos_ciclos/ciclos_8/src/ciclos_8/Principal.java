package ciclos_8;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num1=0,num2=0;
		System.out.println("Ingrasar primer numero");
		num1=sc.nextInt();
		System.out.println("Ingresar segundo numero");
		num2=sc.nextInt();
		if(num1<num2) {
			while(num1<=num2){
				System.out.println(num1);
				num1++;
			}
		}else {
			while(num2<=num1){
				System.out.println(num2);
				num2++;
			}
		}
	}

}
