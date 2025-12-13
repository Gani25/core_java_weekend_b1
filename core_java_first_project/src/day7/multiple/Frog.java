package day7.multiple;

// Multiple Inheritance
public class Frog extends Animal implements WaterAnimal, LandAnimal{

	@Override
	public void walk() {
		System.out.println("Frog is walking on Land");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Frog is swimming in Water");
		
	}

	@Override
	public void eat() {
		System.out.println("Frog is eating");
		
	}
	
	public void jump() {
		System.out.println("Frog is jumping");
	}

}
