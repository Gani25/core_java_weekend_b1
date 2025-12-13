package day7.lambda;

public class MainClass3 {
	
	
	public static void main(String[] args) {
		// Override sum method with Lambda

		Calculator2 calculator = (n1, n2) -> String.format("Multiplication of %d, %d = %d",n1,n2,(n1*n2));
		
		System.out.println(calculator.multiplication(6, 10));
		
		
	}

}
