package day3;

import java.util.Scanner;

// WAP to print first n natural numbers in reverse order
// n n-1 n-2 ... 1
// start = n, stop = 1, step = -1
public class Wh3 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt(); // start
		// start/ Initialization
		int i = n ;
		
		while(i >= 1) {
			
			System.out.println(i+" ");
			i--; // i = i - 1
		}
		
	}

}
