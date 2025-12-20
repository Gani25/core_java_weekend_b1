package day9.generics;

public class MainClass {
	
	public static void main(String[] args) {
		int n1 = 56,n2=0;
		// Generic only support reference of Java Class and not primitives
		Calculator<Object> calculator =new Calculator<>();
		
		if(n2 != 0) {
			// wrapper class -> primitive int (Wrapper Class Integer)
			Integer ans = n1/n2;
			
			calculator.setResult(ans);
		}else {
			String msg = "Cannot divide by 0";
			calculator.setResult(msg);
		}
		
		
		System.out.println(calculator);
	}

}
