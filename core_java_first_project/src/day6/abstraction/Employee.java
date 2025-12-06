package day6.abstraction;

public class Employee extends Person {

	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Emp Default Const");
	}

	public Employee(String name, String gender, int age, int empId, double salary) {
		super(name, gender, age);

		System.out.println("Emp Param Constr");
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void greet() {

		System.out.println("Hello" + name);
	}

}
