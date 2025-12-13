package day7.lambda;

public class MainClass2 {
	
	
	public static void main(String[] args) {
		// Override sum method with Lambda

		Calculator calculator = (n1, n2) -> System.out.println("Addition of " + n1 + ", " + n2 + " = " + (n1+n2));
		
		
		calculator.sum(60, 10);
		
		
	}

}
