package edu.oop.zaklady;

public class MyDate {
	
	int year;
	int month;
	int day;
	
	boolean isLeapYear() {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	boolean isValidDate() {
		return day > 0 && day < 32 && month > 0 && month < 13;
	}
	
	
}
