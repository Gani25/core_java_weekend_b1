package day4;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Rohit Sharma";
		p1.age = 30;
		p1.gender = "Male";
		
		System.out.println("Name = "+p1.name);
		System.out.println("Age = "+p1.age);
		System.out.println("Gender = "+p1.gender);
	}

}
