package day7.interface_example;

public class Student implements Person {
	
	private int rollNo;
	
	private String name;
	
	private double percentage;

	public Student(int rollNo, String name, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	
	
	@Override
	public void showInfo() {
		System.out.println("Student Information");
		System.out.println("Roll no = " + rollNo);
		System.out.println("Name = " + name);
		System.out.println("Percentage = " + percentage);
		
		System.out.println("College Info = "+Person.BRAND);

	}
	
	
	
	

}
