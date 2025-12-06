package day6.important;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.sayHello();
		
		Calculator.addition(50, 60);
		Calculator.subtraction(90, 10);	
		
//		System.out.println(Calculator.brand);
		System.out.println(Calculator.getBrand());
	}

}
