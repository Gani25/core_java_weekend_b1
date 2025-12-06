package day6.important;

public class Calculator {
	
	private static String brand = "Casio";
	
	public static void addition(int n1, int n2) {

		System.out.println("Addition of 2 numbers = "+(n1+n2));
	}
	
	static String getBrand() {
		return brand;
	}
	
	public static void subtraction(int n1, int n2) {
		System.out.println("Subt of 2 numbers = "+(n1-n2));
		addition(60, 100);
		
		// non static method we can access with objects
//		Calculator calculator = new Calculator();
//		calculator.sayHello();
		
		// ERROR static methods cannot access non static method
		// to access non static method we need objects
		
	}
	
	public void sayHello() {
		System.out.println("Hello All");
		
		addition(60, 80);		
		sayGreet("Shubham");
	}
	
	public void sayGreet(String name) {
		System.out.println("Welcome "+name+",");
	}

}
