package day4;

import java.util.Scanner;

//WAP to accept a number continously and display square unless user presses 0 to exit
public class DoWhile2 {

	public static void main(String[] args) {

		int n, sq;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter a number to display square of press 0 to exit: ");
			n = sc.nextInt();

			if (n == 0) {
				System.out.println("Exiting....");
			} else {

				sq = n * n;

				System.out.println("The square of " + n + " is " + sq);
			}
		} while (n != 0);

	}

}
