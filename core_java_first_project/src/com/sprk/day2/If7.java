package com.sprk.day2;

import java.util.Scanner;

/*
 * Electricity Bill Generator:
	Accept Unit Consumption
	Based on below criteria charge bill amount
	1. First 50 units: 5/unit
	2. Next 150 units: 8/unit
	3. Next 250 units: 15/unit 
	4. Units above 250: 20/unit
 * 
 * */
public class If7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit consumed: ");
		int unitConsumed = sc.nextInt();
		int billAmount = 0;
		if(unitConsumed <= 50) { // First 50 Unit
			billAmount = unitConsumed * 5;
		}else if(unitConsumed <= 200) { // Next 150 unit
			
			billAmount = 50 * 5 + (unitConsumed - 50) * 8;
			
		}else if (unitConsumed <= 450) {
			billAmount = 50 * 5  + 150 * 8 + (unitConsumed - 200) * 15;
		}else {
			billAmount = 50 * 5  + 150 * 8 + 250 * 15 + (unitConsumed - 450) * 20;
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("Unit Consumed = "+unitConsumed);
		System.out.println("Amount Charged = "+billAmount);
		System.out.println("-----------------------------------------------------------");
		
	}
	

}
