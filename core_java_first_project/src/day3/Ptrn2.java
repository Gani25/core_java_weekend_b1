package day3;

import java.util.Scanner;

public class Ptrn2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		// ROW
		
		for(int i = 1; i <= n; i++) {
			
			// COLUMN
			
			for(int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			
			// New Line
			System.out.println();
		}
	}
}

