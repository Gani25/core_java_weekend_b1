package day4;

public class Person {

	// FIELDS
	private int age;

	private String name;

	private String gender;

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
	
	public void display() {
		System.out.println("Person Info");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Gender = "+gender);
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
