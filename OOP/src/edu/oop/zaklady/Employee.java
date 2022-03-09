package edu.oop.zaklady;

public class Employee {
	
	int id;
	String firstName;
	String lastName;
	int salary;
	
	String getName() {
		return firstName + " " + lastName;
	}

	int getAnnualSalary() {
		return salary * 12;
	}
	
	int raiseSalary(int percent) {
		double per = 1 + (percent / 100);
		salary = (int) (salary * per);
		return salary;
	}
}
