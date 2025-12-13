package day7.interface_example;

public class Employee implements Person {

	private int empId;

	private String name;

	private double salary;
	
	

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void showInfo() {

		System.out.println("Employee Information");
		System.out.println("Emp Id = " + empId);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
		
		System.out.println("Company Info = "+Person.BRAND);

	}
	
	
	
	

}
