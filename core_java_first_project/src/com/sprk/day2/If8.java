package com.sprk.day2;

import java.util.Scanner;

// WAP to print dayName when user pass dayNumber
// input = 1, conditions = 8 


public class If8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day number: ");
		int dayNumber = sc.nextInt();
		
		if(dayNumber == 1) {
			System.out.println("Monday");
		}else if(dayNumber == 2) {
			System.out.println("Tuesday");
			
		}else if(dayNumber == 3) {
			System.out.println("Wednesday");
			
		}else if(dayNumber == 4) {
			System.out.println("Thursday");
			
		}else if(dayNumber == 5) {
			System.out.println("Friday");
			
		}else if(dayNumber == 6) {
			System.out.println("Saturday");
			
		}else if(dayNumber == 7) {
			System.out.println("Sunday");
			
		}else {
			System.out.println("Invalid Day Number");
		}
	}
}
