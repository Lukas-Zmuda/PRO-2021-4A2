import java.util.Scanner;

public class Priemer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pocet = 0;
		double suma = 0;
		int cislo = 0;
		
		System.out.println("Zadaj cislo: ");
		cislo = sc.nextInt();
		
		while(cislo != 0) {
			suma += cislo;
			pocet++;
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();			
		}
				
		System.out.println("Priemer: " + (suma / pocet));

	}

}
