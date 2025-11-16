package day3;

import java.util.Scanner;

//WAP to print table of n till x iterations

public class Wh4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to print table: ");
		int n = sc.nextInt();
		
		System.out.println("Enter number of iterations: ");
		int x = sc.nextInt();
		
		int i = 1;
		int table;
		System.out.println("Table of "+n+" till "+ x+" iterations");
		while(i <= x) {
			
			table = n * i;
			System.out.println(n+" X "+i+" = "+table);
			i++;
		}
	}
}
