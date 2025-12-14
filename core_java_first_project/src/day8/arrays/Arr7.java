package day8.arrays;

// Leetcode 167. Two Sum II - Input Array Is Sorted
public class Arr7 {
	
	public int[] twoSum(int[] numbers, int target) {
		
		// find smallest and largest element in array
		
		int smallestIndex = 0;
		int largestIndex = numbers.length-1;
		int sum;
		while(largestIndex > smallestIndex) {
			sum = numbers[smallestIndex] + numbers[largestIndex];
			
			if(sum == target) {
				return new int[]{smallestIndex + 1, largestIndex+1};
			}else if(sum > target) {
				largestIndex--;
			}else {
				smallestIndex++;
			}
		}
		
		return new int[]{};
	}

	public static void main(String[] args) {

		Arr7 arr7 = new Arr7();
		
		int[] arr = {2,7,11,15};
		int search = 9;
		
		int[] resultArr = arr7.twoSum(arr, search);
		if(resultArr.length == 0) {
			System.out.println("Target Not Found");
		}else {
			for(int i = 0; i< resultArr.length;i++) {
				System.out.print(resultArr[i]+"\t");
				
			}
			
			System.out.println();
			System.out.println(String.format("The sum of %d and %d = %d. Therefore index1 = %d, index2 = %d. We return [%d, %d].",arr[resultArr[0]-1], arr[resultArr[1]-1], search,resultArr[0], resultArr[1],resultArr[0], resultArr[1]));
		}
	}

}
