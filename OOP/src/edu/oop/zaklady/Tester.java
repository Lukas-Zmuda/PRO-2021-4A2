package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia
		Ucet mojUcet;
		
		//inicializacia objektu
		mojUcet = new Ucet();
		
		Ucet ferovUcet = new Ucet();
		
		mojUcet.vypisInfo();
		
		mojUcet.cislo = "SK1209000000001234567890";
		//System.out.println("Cislo mojho uctu: " + mojUcet.cislo);
		mojUcet.mena = "EUR";
		mojUcet.typ = "bezny";
		mojUcet.zostatok = 10;
		
		ferovUcet.cislo = "CZ220520000000987654321";
		ferovUcet.mena = "CZK";
		ferovUcet.typ = "sporiaci";
		ferovUcet.zostatok = 5450;
		
//		System.out.println("Cislo: " + ferovUcet.cislo);
//		System.out.println("Mena: " + ferovUcet.mena);
//		System.out.println("Typ: " + ferovUcet.typ);
//		System.out.println("Zostatok: " + mojUcet.zostatok);

		mojUcet.vypisInfo();
		System.out.println("-------------");
		ferovUcet.vypisInfo();
		
		Ucet uu = new Ucet("SK220900000000123456789", "sporiaci", 1200, "USD");
		System.out.println("----------------");
		uu.vypisInfo();
		
		
		
		
		
		
		
		
		
		
		
	}

}
