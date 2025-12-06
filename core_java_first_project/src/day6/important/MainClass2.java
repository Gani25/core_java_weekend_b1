package day6.important;

public class MainClass2 {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.walk();
	
		Animal.sayAnimalName();
		
		Dog.sayAnimalName();
		
		Animal animal1 = new Animal();
		System.out.println(animal1.color);
		
		animal1.walk("Dog");
		
		Animal animal2 = new Animal("Pink");
		System.out.println(animal2.color);
		
		
		System.out.println("Type = "+Animal.TYPE);
	}

}
