package com.sprk.day2;
// WAP to check whether the number is positive or negative or zero

import java.util.Scanner;

//input = 1, conditions = 3 (if else if else)
public class If4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("Number = "+n+" is a positive number ");
		}else if(n < 0) {
			System.out.println("Number = "+n+" is a negative number ");
			
		}else {
			System.out.println("Number = "+n+" is Zero");
			
		}
	}
}
