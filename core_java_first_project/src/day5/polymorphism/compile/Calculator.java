package day5.polymorphism.compile;

public class Calculator {
	
	// method overloading
	/*
	 * a. 2 or more method with the same name in the same class but with different number 
	 * of parameters is called as overloading
	 * 
	 * b. If we have same parameters then their signature should be different
	 * */
	
	void addition(int n1, int n2) {
		System.out.println("Addition of 2 integers = "+(n1+n2));
	}
	
	void addition(int n1,int n2, int n3) {
		System.out.println("Addition of 3 integers = "+(n1+n2+n3));
		
	}
	void addition(double n1, int n2) {
		System.out.println("Addition of 2 decimal = "+(n1+n2));
	}

}
