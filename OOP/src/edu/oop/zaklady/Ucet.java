package edu.oop.zaklady;

public class Ucet {
	
	//vlastnosti
	//instancne premenne - (angl. fields)
	String cislo;
	String typ;
	double zostatok;
	String mena;
	
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
