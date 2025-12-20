package day9.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// Boxing
		int numVar = 50;

		Integer wrapInt = Integer.valueOf(numVar); // Manual Boxing

		System.out.println("int value = " + numVar);
		System.out.println("Integer value = " + wrapInt);

		// Auto Boxing
		Integer wrapInt2 = numVar; // AutoBoxing
		System.out.println("Integer value autoboxed = " + wrapInt2);

		// Unboxing
		Double wrapDouble = 5.56;
		double doubleVar = wrapDouble.doubleValue(); // manual unboxing

		// Auto Unboxing
		double doubleVar2 = wrapDouble; // auto unboxing
		
		System.out.println("Wrapper Double value = "+wrapDouble);
		System.out.println("Double primitive value 1 = "+doubleVar);
		System.out.println("Double primitive value 2 auto unboxed = "+doubleVar2);
	}
}
