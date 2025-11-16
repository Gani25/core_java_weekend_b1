package day3;

import java.util.Scanner;

//WAP to print factorial of n

//ex n = 5
// 5 * 4 * 3 * 2 * 1 = 120
// start = n, stop = 1, step = -1
public class Wh5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial: ");
		int n = sc.nextInt();
		
		// start / initialization
		int i = n; 
		int factorial = 1;
		
		while(i >= 1) {
			
			factorial = factorial * i;
			
			i--;
		}
		
		System.out.println("The factorial of "+n+" is "+factorial);
	}

}

/*
 * 1. WAP to print sum of 1 to n
 * 2. WAP to print cube of 1 to n
 * 3. WAP to print first 10 even numbers
 *  2 4 6 8 10 12 14 16 18 20
 * 
 */