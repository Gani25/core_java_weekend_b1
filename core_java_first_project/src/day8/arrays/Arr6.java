package day8.arrays;

// Put even and odd elements of array in two seperate arrays
public class Arr6 {

	public static void displayArr(int[] arr) {
		if(arr != null) {
			System.out.println("Elements are: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 15, 21, 31, 9, 23, 1 };

		displayArr(arr);
		// Step 1: Count -> even and odd element -> store in seperate variables
		// Step 2: if even/odd count > 0 -> create 2 seperate new arrays
		// Step 3: loop through old array

		int evenLength = 0, oddLength = 0;

		int arrLength = arr.length;
		int i;
		for (i = 0; i < arrLength; i++) {
			if (arr[i] % 2 == 0) {
				evenLength++;
			} else {
				oddLength++;
			}
		}
		
//		System.out.println("Even size = "+evenLength);
//		System.out.println("Odd size = "+oddLength);
		int[] evenArray = null;
		int[] oddArray = null;
		if(evenLength > 0) {
			evenArray = new int[evenLength];
		}
		if(oddLength>0) {
			oddArray = new int[oddLength];
		}
		
		// assign even elements to even array
		
		int evenIndex = 0, oddIndex = 0;
		for(i = 0; i< arrLength; i++) {
			if( arr[i] % 2 == 0) {
				evenArray[evenIndex] = arr[i];
				evenIndex++;
			}else {
				oddArray[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		
		
		System.out.println("Only odd array elements are: ");
		displayArr(oddArray);
		
		System.out.println("Only even array elements are: ");
		displayArr(evenArray);
	}

}
