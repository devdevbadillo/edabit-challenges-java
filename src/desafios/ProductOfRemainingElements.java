package desafios;


/*
 Write a function that returns true if you can partition an array into one element and the rest, 
 such that this element is equal to the product of all other elements excluding itself.
 
 Examples
	canPartition([2, 8, 4, 1]) ➞ true
	// 8 = 2 x 4 x 1
	
	canPartition([-1, -10, 1, -2, 20]) ➞ false
	
	canPartition([-1, -20, 5, -1, -2, 2]) ➞ true
	
  Notes
	- The array may contain duplicates.
	- Multiple solutions can exist, any solution is sufficient to return true.
  
  Link: https://edabit.com/challenge/EjQM5woRAhYEmuGFp
	
 */
public class ProductOfRemainingElements {
	
	public boolean canPartion(int[] numbers) {
		
		boolean flag = false;
		
		for(int i = 0; i < numbers.length; i++) {
			int result = 1;
			
			for(int j = 0; j < numbers.length; j++) {
				if(i == j) continue;
				result *= numbers[j];
			}
			
			if(result == numbers[i]) {
				flag = true;
				break;
			}
			
		}
		
		return flag;
	}
	
	public static void main(String...args) {
		ProductOfRemainingElements productElements = new ProductOfRemainingElements();
		
		int [] numbers = {-1, -10, 1, -2, 20};
		boolean result = productElements.canPartion(numbers);
		
		System.out.print(result);
	}

}
