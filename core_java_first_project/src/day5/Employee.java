package day5;

import day5.base.Person;

public class Employee extends Person {

	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Default constructor of Employee");
	}

	public Employee(int empId, String name, String gender, int age, double salary) {
		
//		super(); // default constructor of base class
		super(name, age, gender);
		
		System.out.println("Parameterized constructor of Employee");
		this.empId = empId;
		
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary="
				+ salary + "]"+super.toString();
	}
	

}
