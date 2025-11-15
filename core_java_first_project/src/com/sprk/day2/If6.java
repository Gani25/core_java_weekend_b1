package com.sprk.day2;

import java.util.Scanner;

/*
 * WAP to accept 3 sides of a triangle and check
 * 1. Equilateral -> All sides are equal
 * 2. Isoceles -> Any 2 sides are equal
 * 3. Scalene -> No sides are equal
 * 
 * */
public class If6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 side of a triangle: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		if(s1 > 0 && s2 >0 && s3 > 0) {
		
			if(s1 == s2 && s2 == s3) {
				System.out.println("Equilateral Triangle");
			}else if(s1 == s2 || s2 == s3 || s1 == s3) {
				System.out.println("Isoceles Triangle");
			}else {
				System.out.println("Scalene Triangle");
			}
		}else {
			System.out.println("Invalid Triangle Side cannot be -ve or 0");
			
		}
	}

}
