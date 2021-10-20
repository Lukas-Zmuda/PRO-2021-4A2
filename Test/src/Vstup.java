import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner vstup = new Scanner(System.in);
		
		String meno = "";
		int rokNarodenia = 0;
		
		System.out.println("Ako sa volas?");
		meno = vstup.nextLine();
		
		System.out.println("Ahoj " + meno + ". V ktorom roku si sa narodil?");
		rokNarodenia = vstup.nextInt();
		
		System.out.println(meno + " ty mas uz " + (2021 - rokNarodenia) + " rokov");
		

	}

}
