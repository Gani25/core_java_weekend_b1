package com.sprk.day2;

import java.util.Scanner;

/*
 * FIZZBUZZ Problem
 * WAP accept a number and display message based on bellow criteria
 * 
 * a. number is divisible by 3 -> FIZZ
 * b. number is divisible by 5 -> BUZZ
 * c. number is divisible by 3 as well as 5 -> FIZZBUZZ
 * d. number is not divisible by any -> number
 * */

// Input = 1, conditions = 4 (if elseif elseif else)
public class If5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if (n % 3 == 0 && n % 5 == 0) {
			
			System.out.println("FIZZBUZZ");

		} else if (n % 5 == 0) {
			
			System.out.println("BUZZ");

		} else if (n % 3 == 0) {
			
			System.out.println("FIZZ");

		} else {
			System.out.println(n);
		}
	}
}
