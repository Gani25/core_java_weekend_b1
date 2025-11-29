package day5.polymorphism.compile;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.addition(1, 10);
		calculator.addition(15, 10,5);
		calculator.addition(6.5, 10);
	}

}
