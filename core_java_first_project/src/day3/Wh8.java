package day3;

import java.util.Scanner;

// WAP to print sum of digit of n
// Ex n = 128
//8 + 2 + 1 = 11
public class Wh8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i = n, sum = 0, lastDigit;
		
		while(i > 0) {
			lastDigit = i  % 10;
			
			sum = sum + lastDigit;
			
			i = i / 10;
		}
		
		System.out.println("The sum of digit of "+n+" is "+ sum);
		
	}
}
