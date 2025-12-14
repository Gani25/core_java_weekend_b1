package day8.arrays;

// Creating Array In Java
// Initializing array first approach
public class Arr1 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 60;
		arr[1] = 40;
		arr[2] = -5;
		arr[3] = 65;
		arr[4] = 12;
	
		// arr[5] = 99; // EXCEPTION -> ARRAYINDEXOUTOFBOUND
		
		System.out.println(arr);
		
		System.out.println("Length of Integer Array = "+arr.length);
	
		System.out.println("Elements present in arrays are: ");
		System.out.println("Element at index 0 = "+arr[0]);
		System.out.println("Element at index 1 = "+arr[1]);
		System.out.println("Element at index 2 = "+arr[2]);
		System.out.println("Element at index 3 = "+arr[3]);
		System.out.println("Element at index 4 = "+arr[4]);
	
	}

}
