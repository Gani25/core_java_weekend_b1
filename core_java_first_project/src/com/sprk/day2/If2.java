package com.sprk.day2;

import java.util.Scanner;

// WAP to check whether the number is divisible by 3 or not
// input = 1, conditions = 2 (if else)


public class If2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int remainder = num % 3;
		
		if (remainder == 0) {
			System.out.println("Number = "+num+" is divisible by 3");
		}else {
			System.out.println("Number = "+num+" is not divisible by 3");
			
		}	
		
		sc.close();
	}
}

// WAP to check whether the number is even or odd
// Even num -> Divisible by 2
