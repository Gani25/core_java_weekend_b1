package com.sprk.day2;

import java.util.Scanner;

// WAP to check whether the number is divisible by 3 and 5 both or not

//input = 1, conditions = 2
public class If3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) {
			
			System.out.println("Number = "+num+" is divisible by 3 and 5 both");
			
		}else {
			
			System.out.println("Number = "+num+" is not divisible by 3 and 5 both");
			
		}
		
	}
}
