package day6.important;

public class Animal {

	public final String color;
	
	public final static String TYPE = "GOAT";

	public Animal() {
		color = "Brown";
	}
	
	public Animal(String color) {
		this.color = color;
	}

	public final void walk() {
		System.out.println("Animal is walking");
	}
	public final void walk(String name) {
		System.out.println("Animal is walking: "+name);
	}

	public final static void sayAnimalName() {
		System.out.println("I am Animal");
	}
}
