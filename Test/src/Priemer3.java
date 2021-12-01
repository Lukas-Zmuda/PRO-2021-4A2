import java.util.Scanner;

public class Priemer3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pocet = 0;
		double suma = 0;
		int cislo = 0;
		
		do {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextInt();
			suma += cislo;
			pocet++;
		}while(cislo != 0);
			
		pocet--;
		System.out.println("Priemer: " + (suma / pocet));

	}

}
