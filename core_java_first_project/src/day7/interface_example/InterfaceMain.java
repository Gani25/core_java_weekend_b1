package day7.interface_example;

import java.util.Scanner;

public class InterfaceMain {
	
	public static void main(String[] args) {
		Student student = new Student(1, "Memon Abdul", 45.56);
		
		student.showInfo();
		
		Person.sayHello();
		
		// Dynammic Method Dispatch.
		/*
		 * Reference of Base Class and Object Of Derived Classes is called as
		 * Dynammic Method Dispatch
		 * */
		
//		Person person = new Employee(1001, "Shruti", 2500);
		Person person = new Student(1, "Shruti", 85.55);
		
		person.showInfo();
		
		
	}

}
