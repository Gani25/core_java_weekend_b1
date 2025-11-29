package day5.main;

import day5.Employee;
import day5.PartEmployee;

public class EmployeeMain1 {
	
	public static void main(String[] args) {
		Employee employee = new Employee(1001, "Shruti Sharma", "Female", 35, 10000);
		
		employee.deductTax();
		System.out.println(employee);
		
		PartEmployee partEmployee = new PartEmployee(1020, "Shushant Sharma", "Male", 36, 3500, 45);
		partEmployee.deductTax();
		System.out.println(partEmployee);
	}
}
