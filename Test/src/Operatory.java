
public class Operatory {

	public static void main(String[] args) {

		//aritmeticke
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 5);
		System.out.println(10 / 3.0);
		
		System.out.println("--------------");
		//relacne
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);

		//logicke
		System.out.println((10 < 5) && (10 != 5) || !(10 <= 5));
		
		int a = 10;
		a = a + 5;
		a += 5;//ekvivalentne s predch. prikazom
		//-= *= /= %=
		
		a += 1;
		a++;
		a--;
		
		
		System.out.println("a = " + a);
		
		
		
	}

}
