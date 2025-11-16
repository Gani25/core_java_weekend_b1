package day3;

import java.util.Scanner;

// WAP to check whether the number is a prime number or not
public class Wh10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		// assumption -> any value of n is a prime number
		boolean isPrime = true;
		
		if(n <= 1) {
			isPrime = false;
		}
		
		// check it is a prime or not -> loop start = 2, stop = n-1, gap = +1
		
		int i = 2;
		
		while(i <= n-1) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println("Number = "+n+" is a prime number");
		}else {
			System.out.println("Number = "+n+" is not a prime number");
		}
		
		
	}
}