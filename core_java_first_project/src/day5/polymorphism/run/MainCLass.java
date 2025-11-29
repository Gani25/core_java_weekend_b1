package day5.polymorphism.run;

public class MainCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		animal.eat();
		animal.walk();
		Dog dog = new Dog();
		
		dog.eat();
		dog.walk();

	}

}
