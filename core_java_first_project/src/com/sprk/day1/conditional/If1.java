package com.sprk.day1.conditional;

import java.util.Scanner;

// WAP to check whether the number is positive or negative
// Input = 1
// Conditions = 2 (if else)
	//	+ve -> number > 0
	//	-ve -> number < 0
public class If1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num >= 0) { 
			
			System.out.println("Number = "+num+" is a positive number");
			
		}else {
			
			System.out.println("Number = "+num+" is a negative number");
			
			
		}
	}

}

/*
 * 1. WAP to check whether the number is zero or non zero
 * 2. WAP to check greatest of 2 numbers
 * 
 * */
