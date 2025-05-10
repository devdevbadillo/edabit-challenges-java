package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
  Create a function that takes an array arr and a number n and returns an array of two integers from arr 
  whose product is that of the number n of the following form:
	
	[value_at_lower_index, value_at_higher_index]

  Examples
	twoProduct([1, 2, 3, 9, 4, 5, 15, 3], 45) ➞ [9, 5]
	// at index 5 which has the value 5 is  a full match 
	// to the value at index 3 which is 9
	// the closest gap between indices that equates 
	// to the product which is 45
	
	twoProduct([1, 2, 3, 9, 4, 15, 3, 5], 45) ➞ [3, 15]
	// at index 5 which has the value 15 is a full match 
	// to the value at index 2 which is 3
	// the closest gap between indices that equates 
	// to the product which is 45
	
	twoProduct([1,  2, -1,  4,  5,  6,  10, 7], 20) ➞ [4, 5]
	// at index 4 which has the value 5 is a full match 
	// to the value at index 3 which is 4
	// a full match can only be achieved  if you've found the multiplier at an
	// index lower than the current index, thus, 5 (@ index 4) has a pair lower
	// than its index which is the value 4 (@ index 3), so, 5*4 = 20, in which 5
	// has a higher index (4) than 4 which has an index value of 3
	
	twoProduct([1, 2, 3, 4, 5,  6, 7, 8, 9, 10], 10) ➞ [2, 5]
	
	twoProduct([100, 12, 4, 1, 2], 15) ➞ []
	
 Notes
	- There will be no duplicates.
	- Return an empty array if no match is found.
	- Always consider that the pair of the element-in-question (the current item pointed to during the search), is at its left-side.
	- In the array, there can be multiple solutions so return the solution with the lowest sum of indexes of product pairs 
		(i.e. N = 10, solutions = [[2, 5], [10, 1]], indexes = [[600, 3000], [800, 900]], return [10, 1]).
	- The array can have multiple solutions that share the lowest sum of indexes, so return the first full match that's 
		found (as described above) that also has the lowest sum of indexes.
 */
public class TwoProblemProduct {

	public List<Integer> twoProduct(List<Integer> arr, Integer num){
		
		List<Integer> indexes = new ArrayList<>();
		
		for(int i = 0; i < arr.size(); i++) {
			
			if ( num % arr.get(i) == 0 && arr.contains(num / arr.get(i)) ) {
				Integer missingIndex = arr.indexOf(num / arr.get(i));
				
				if( !indexes.contains(i) && !indexes.contains(missingIndex) ) {
					indexes.add(i);
					indexes.add(missingIndex);	
				}
			}
			
		}
		
		if (indexes.size() == 0) return indexes;
		
		int result = indexes.get(0) + indexes.get(1);
		int init = indexes.get(0);
		int end = indexes.get(1); 
		
		for(int i = 2; i < indexes.size(); ) {
			
			if( indexes.get(i) + indexes.get(i + 1) < result) {
				init = indexes.get(i);
				end = indexes.get(i + 1);
			};
			
			i += 2;
		}
		
		
		return List.of(arr.get(init), arr.get(end));
	}
	
	public static void main(String[] args) {
		TwoProblemProduct problem = new TwoProblemProduct();
		
		List<Integer> arr = List.of(1, 2, 3, 9, 4, 15, 3, 5);
		Integer num = 45;
		List<Integer> result = problem.twoProduct(arr, num);
		
		System.out.print(result);
	}

}
