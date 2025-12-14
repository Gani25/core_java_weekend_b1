package day8.arrays;

import java.util.Scanner;

public class Arr4 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		int size = arr.length;
		
		for(int i = 0; i < size;i++) {
			System.out.println("Enter element at position "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		// Display --> LOOPS
		
		System.out.println("Elements are: ");
		for(int i = 0; i<size;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		// Display element in reverse order
		// start = size-1; stop = 0; gap = -1
		System.out.println("\nElements in reverse order are: ");
		for(int i = size-1; i>=0;i--) {
			System.out.print(arr[i]+"\t");
		}
		
	}

}
