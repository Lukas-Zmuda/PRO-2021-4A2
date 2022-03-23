package edu.oop.zaklady;

public class Ucet {
	
	//vlastnosti
	//instancne premenne - (angl. fields)
	String cislo;
	String typ;
	double zostatok;
	String mena;
	
	//konstruktor
	Ucet(){
		cislo = "SK**********************";
		typ = "bezny";
		zostatok = 1;
		mena = "EUR";
		System.out.println("Volany prazdny konstruktor");
	}
	
	
	
	public Ucet(String cislo, String typ, double zostatok, String mena) {
		super();
		this.cislo = cislo;
		this.typ = typ;
		this.zostatok = zostatok;
		this.mena = mena;
		System.out.println("Volany konstruktor so vsetkymi params");
	}




	//schopnosti
	//metody
	void vypisInfo() {
		System.out.println("Cislo: " + cislo);
		System.out.println("Typ: " + typ);
		System.out.println("Zostatok: " + zostatok + " " + mena);
	}
	
	void vklad(double suma) {
		//TODO
	}
	
	void vyber(double suma) {
		//TODO
	}
	
	

}
