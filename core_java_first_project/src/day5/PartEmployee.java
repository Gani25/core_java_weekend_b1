package day5;

public class PartEmployee extends Employee {

	private double dailyWages;
	private int numOfDays;

	public PartEmployee() {
		System.out.println("Default constructor of PartEmployee");
	}

	public PartEmployee(int empId, String name, String gender, int age, double dailyWages,int numOfDays) {
		super(empId, name, gender, age, dailyWages * numOfDays);
		System.out.println("Parameterized constructor of PartEmployee");
		this.dailyWages = dailyWages;
		this.numOfDays = numOfDays;
	}

	@Override
	public String toString() {
		return super.toString()+ "PartEmployee [dailyWages=" + dailyWages + ", numOfDays=" + numOfDays + "]";
	}
	
	
	@Override
	public void deductTax() {
		System.out.println("No tax for part employee");
}
	
	
	

}
