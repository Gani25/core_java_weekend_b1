package day9.arrays;

// WAP to reverse a given array inplace
public class Arr1 {
	
	public static void displayArray(int[] arr) {
		System.out.println("Elements are: ");
		// Enhanced for loop(for each)
		
		for(int element:arr) {
			System.out.print(element+"\t");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int array[] = {5,1,7,9,3,2};
		
		displayArray(array);
		
		int start = 0;
		int end = array.length-1;
		
		while(end > start) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reverse array is: ");
		displayArray(array);
	}

}
