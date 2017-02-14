package org.usc.edu.hash;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setFirstname("A");
		e1.setLastName("AL");
		e1.setId(1800);
		e2.setFirstname("B");
		e2.setLastName("BL");
		e2.setId(100);
		System.out.println("e1 equals e2 implementation " + e1.equals(e2));
		
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		e3.setFirstname("A");
		e3.setLastName("AL");
		e3.setId(100);
		e4.setFirstname("A");
		e4.setLastName("AL");
		e4.setId(100);
		System.out.println("e3 equals e4 implementation " + e3.equals(e4));
	}

}
