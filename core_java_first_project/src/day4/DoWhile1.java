package day4;

public class DoWhile1 {
	
	public static void main(String[] args) {
		int i = 10;
		
		while (i <= 1) {
			
			System.out.println("Hello and value of i = "+i);
			i--;
			
		}
		
		System.out.println("Value of i after while loop = "+i);
		
		do {
			System.out.println("Hello from do while and value of i = "+i);
			
			i--;
		}while(i <= 1);
		
		System.out.println("Value of i after do-while loop = "+i);
	}

}
