package com.sprk.day2;

import java.util.Scanner;

//WAP to check whether the character is vowel or consonant
// a e i o u A E I O U
// input = 1, conditions = 11
public class Sw2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter alphabet: ");
		char alphabet = sc.next().charAt(0);

		switch (alphabet) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Character = " + alphabet + " is a vowel");
			break;
		default:
			System.out.println("Character = " + alphabet + " is a consonant");
		}

	}

}

/*
 * Create a simple calculator which accepts 2 number and one operator(+,-,*,/)
 * Based on operator perform calculation and display message
 * 
 * Example 1 :
 * n1 = 10, n2 = 6, operator = +
 * 10 + 6 = 16
 * 
 * Example 2:
 * n1 = 5, n2 = 8, operator = *
 * 5 * 8 = 40
 * 
 * Example 3:
 * n1 = 15, n2 = 0, operator = /
 * Cannot Divide By Zero
 * 
 * Example 4:
 * n1 = 15, n2 = 3, operator = /
 * 15 / 3 = 5
 * 
 * 
 */
