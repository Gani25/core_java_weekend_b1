package day5.base;

//protected -> visible only to the base classes and derived class 

public class Person {

	// FIELDS
	protected int age;

	protected String name;

	protected String gender;

	// methods
	// Default Constructor
	public Person() {
		System.out.println("Default constructor of Person");
	}
	
	// Parameterized Constructor
	public Person(String name, int age, String gender){
		System.out.println("Parameterized constructor of Person");
		
		this.name = name;
		
		this.age = age;
		
		this.gender = gender;
		
	}
	
	public Person( int age){
		System.out.println("Parameterized constructor of Person only with age");
		this.age = age;	
		
	}
	

	public void walk() {
		System.out.println("Person is Walking");
	}
	

	
	// getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

	
	
	
}
