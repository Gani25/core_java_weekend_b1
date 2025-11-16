package day3;

import java.util.Scanner;

public class Ptrn6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int n = sc.nextInt();

		// ROW

		for (int i = n; i >= 1; i--) {

			// COLUMN

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// New Line
			System.out.println();
		}

		// ROW

		for (int i = 2; i <= n; i++) {

			// COLUMN

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// New Line
			System.out.println();
		}
	}
}
