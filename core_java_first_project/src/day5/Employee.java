package day5;

import day5.base.Person;

public class Employee extends Person {

	protected int empId;

	protected double salary;

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
	
	// If salary > 15000 then -10%
	public void deductTax() {
		
		if(salary >= 15000) {
			double taxAmount = salary * 0.1;
			
			System.out.println("Deducting 10% of salary: "+salary+" = "+taxAmount);
			
			salary = salary - taxAmount;
					
		}else {
			System.out.println("No tax deducted");
		}
		
	}
	

}
