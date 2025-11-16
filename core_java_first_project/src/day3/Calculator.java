package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int n1, n2;
		char op;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.println("Choose operator(+, -, *, /): ");
		op = sc.next().charAt(0);

		int result = 0;
		boolean isCorrect = true;
		switch (op) {

		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			if (n2 == 0) {
				System.err.println("Cannot Divide by zero");
				isCorrect = false;
			} else {
				result = n1 / n2;

			}
			break;

		default:
			System.err.println("Choose Correct Operator");
			isCorrect = false;
		}

		if (isCorrect) {
			System.out.println(n1 + " " + op + " " + n2 + " = " + result);
		}

	}

}
