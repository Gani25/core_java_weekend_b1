package day7.lambda;

public class MainClass {
	
	public Calculator createCalcObj() {
		return (n1, n2) -> {
			int result = n1 + n2;
			System.out.println("Addition of " + n1 + ", " + n2 + " = " + result);
		};
		
	}

	public static void main(String[] args) {
		// Override sum method with Lambda

		Calculator calculator = (n1, n2) -> {
			int result = n1 + n2;
			System.out.println("Addition of " + n1 + ", " + n2 + " = " + result);
		};
		
		calculator.sum(60, 10);
		
		
	}

}
