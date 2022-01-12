import java.util.Scanner;

public class UlohaPole2 {

	public static void main(String[] args) {
		
		//2. 
		// - nacitajte 5 cisel
		// - vypiste najmensie z nich
		
		
		Scanner sc = new Scanner(System.in);
		int[] cisla = new int[5];
		
		for(int i = 0; i < cisla.length; i++) {
			System.out.println("Zadaj cislo: ");
			cisla[i] = sc.nextInt();
		}
		
		int min = cisla[0];
		for(int i = 0; i < cisla.length; i++) {
			if(cisla[i] < min) {
				min = cisla[i];
			}
		}
		
		System.out.println("Min: " + min);

	}

}
