package day8.arrays;

import java.util.Scanner;

// WAP to insert element at specific position in given array
//10 20 30 40 50 60

public class Arr5 {

	public static void displayArray(int[] array) {
		System.out.println("Elements in array are: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };

		displayArray(arr);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter position to insert new element: ");

		int position = sc.nextInt();

		if(position > arr.length || position <= 0) {
			System.out.println("Enter position between 0 to "+arr.length+" !!");
			return;
		}
		System.out.println("Enter new element to be inserted at " + position + ": ");
		int newElement = sc.nextInt();

		int[] newArr = new int[arr.length + 1];

		int i, j = 0;

		for (i = 0; i < newArr.length; i++) {
			if (i == position - 1) {
				newArr[i] = newElement;
			} else {
				newArr[i] = arr[j];
				j++;
			}
		}
		
		System.out.println("Array after inserting "+newElement+" at position "+position+": ");
		displayArray(newArr);

	}
}
