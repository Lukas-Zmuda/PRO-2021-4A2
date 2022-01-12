
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia pola (vytvorenie pola)
		String[] mena4A2 = {"Fero", "Oliver", "Lukas", "Kristof", "Matus"};
		
		System.out.println("Prvy v zozname je: " + mena4A2[0]);
		
		System.out.println(mena4A2);
		
		System.out.println("-------------");
		System.out.println("Zoznam ziakov 4A2:");
		
		//pocet prvkov pola
		System.out.println("Pocet ziakov zozname: " + mena4A2.length);
		
		for(int i = 0; i < mena4A2.length; i++) {
			System.out.println(mena4A2[i]);
		}
		
		String[] m4A2 = new String[11];
		//zapis posledneho do zoznamu
		m4A2[m4A2.length - 1] = "Samo";
		m4A2[0] = "Kristof";
		
		
		System.out.println("Vypis celej 2. skupiny:");
		for(String meno: m4A2) {
			if(meno == null) {
				System.out.println("nezname");
			}else {
				System.out.println(meno);				
			}
		}
		

	}

}
