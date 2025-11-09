package com.sprk.day1;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// variable declaration
		int age;
		
		System.out.println("Enter your age:");
		age = sc.nextInt();
		
		System.out.println("Your age is "+age);
	}
}
