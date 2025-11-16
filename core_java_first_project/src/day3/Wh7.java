package day3;

import java.util.Scanner;

// WAP to print cube of 1 to n
public class Wh7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int i = 1;
		int cube;

		while (i <= n) {

			cube = i * i * i;

			System.out.println("The cube of " + i + " is " + cube);
			i++;

		}
	}

}
