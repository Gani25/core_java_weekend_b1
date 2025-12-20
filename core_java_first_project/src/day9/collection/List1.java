package day9.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1 {

	/**
	 * @author:SPRK
	 * @return None
	 * @param String[] 
	 * */
	public static void main(String[] args) {
		// array is fixed in size

		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println(numbers.isEmpty());

		System.out.println("Size of list = " + numbers.size());
		System.out.println(numbers);
		numbers.add(500);
		numbers.add(-22);
		numbers.add(500);
		System.out.println(numbers);

		numbers.addAll(Arrays.asList(50, 65, 23, 50, 99, 50, 22, 500));
		System.out.println(numbers);

		List<Integer> nums = Arrays.asList(12, 2, 3, 33);
		numbers.addAll(0, nums);
		System.out.println(numbers);

		numbers.add(2, 29);
		System.out.println(numbers);

		numbers.addLast(96);

		numbers.addFirst(100);
		System.out.println(numbers);
		
		System.out.println(numbers.contains(500));
		System.out.println(numbers.contains(-25));
		
		
		System.out.println(numbers.get(5));
		
		System.out.println(numbers.indexOf(500));
		System.out.println(numbers.lastIndexOf(500));
		
		
		System.out.println(numbers.isEmpty());
		
		System.out.println(numbers.containsAll(Arrays.asList(-22, 500, 50, 65)));

		System.out.println(numbers.containsAll(Arrays.asList(12,-22, 500, 50, 65)));
		System.out.println(numbers.containsAll(Arrays.asList(12,22220,-22, 500, 50, 65)));
	
		
		System.out.println(numbers);
		Object object = 55;
		System.out.println(numbers.remove(object));
		object = 500;
		System.out.println(numbers.remove(object));
		
		System.out.println(numbers);
		
		System.out.println( numbers.remove(0));
		System.out.println(numbers);
		
		numbers.set(0, 22);
		System.out.println(numbers);
		
		
		for(Integer element: numbers) {
			System.out.println(element);
		}
	}

}
