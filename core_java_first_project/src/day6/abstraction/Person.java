package day6.abstraction;

public abstract class Person {

	protected String name;

	protected String gender;

	protected int age;

	public Person() {
		System.out.println("Person Default Constructor");
	}

	public Person(String name, String gender, int age) {
		super();
		System.out.println("Person Param Const");
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	// abstract methods -> Methods without body
	
	public abstract void greet();
	
	
}
