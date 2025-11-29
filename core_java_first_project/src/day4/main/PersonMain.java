package day4.main;

import day4.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walk();
		p1.display();
		

		Person p2 = new Person(50);
		p2.walk();
		p2.display();
		
		Person p3 = new Person("Abdul Gani", 26, "Male");
		p3.display();
		
		p3.setName("Memon Abdul Gani");
		
		p3.display();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
