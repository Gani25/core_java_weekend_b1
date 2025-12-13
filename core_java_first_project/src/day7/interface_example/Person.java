package day7.interface_example;

public interface Person {

	//	No constructor

	// by default fields are static and final -> belongs to class and not object
	String BRAND = "SPRK";

	void showInfo(); // abstract method and public

	// We can have static methods also
	static void sayHello() {
		
		System.out.println("I am static in Person saying Hello");
	};

}
