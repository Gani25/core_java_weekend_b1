package day3;

import java.util.Scanner;

// WAP to print reverse of a number
// Ex n = 128
//8 + 2 + 1 = 11
public class Wh9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i = n, reverse = 0, lastDigit;
		
		while(i > 0) {
			lastDigit = i  % 10;
			
			reverse = reverse * 10 + lastDigit;
			
			i = i / 10;
		}
		
		System.out.println("The reverse of "+n+" is "+ reverse);
		
		if(reverse == n) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
			
		}
		
	}
}
