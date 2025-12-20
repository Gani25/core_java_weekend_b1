package day9.arrays;

public class Arr2 {

	public static void main(String[] args) {
		int[] arr = { 0, 5, 2, 3, 1 };

		int n = arr.length;

		int sumOfLength = 0;

		for (int i = 0; i <= n; i++) {
			sumOfLength += i;
		}

		int sumOfExistingElements = 0;
		for (int element : arr) {
			sumOfExistingElements += element;
		}
		
		System.out.println("Missing element = "+(sumOfLength-sumOfExistingElements));
	}
}
