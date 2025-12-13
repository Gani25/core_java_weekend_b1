package day7.annonymous;

public class MainClass {

	public static void main(String[] args) {
		
		// Anonymous Class
		Calculator calculator = new Calculator() {

			@Override
			public void sum(int a, int b) {
				System.out.println((a+b));
				
			}

			@Override
			public void multiply(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println((a*b));
				
			}

			@Override
			public void power(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(Math.pow(a, b));
			}
			
		};
		
		calculator.sum(5, 6);
		calculator.multiply(10,5);
		
		calculator.power(6, 3);
		
		
				
	}

}
