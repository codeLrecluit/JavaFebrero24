package ciclos_5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vamos a iniciar");
		String hh,mm,ss;
		for(int i=0; i<24;i++) {
			for(int j=0; j<60; j++) {
				for (int k=0; k<60;k++) {
					if(k<10) {
						ss="0"+k;
					}else {
						ss=""+k;
					}
					if(j<10) {
						mm="0"+j;
					}else {
						mm=""+j;
					}
					if(i<10) {
						hh="0"+i;
					}else {
						hh=""+i;
					}
					System.out.println(hh+":"+mm+":"+ss);
				}
			}
		}

	}

}
