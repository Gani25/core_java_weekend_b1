package day6.abstraction;

public class MainAbstract {

	public static void main(String[] args) {
		Employee employee = new Employee("Rohan","Male",30,1005,2500.2);
		
		employee.greet();
		
		System.out.println(employee);
	}
}
