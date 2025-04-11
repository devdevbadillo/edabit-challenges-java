package desafios;
import java.util.stream.IntStream;
import java.util.HashSet;
import java.util.Set;
/*
  Given an array of numbers, return whether it is possible to make the number 7 by adding any three different numbers together.
  
  - Examples
	luckySeven([2, 4, 3, 8, 9, 1]) ➞ true (7 + 20)
	
	luckySeven([2, -1, 0, 6, 3, 1]) ➞ true (7 + 4)
	
	luckySeven([0, 0, 0, 2, 3]) ➞ false
	// You cannot repeat the same number to make 2 + 2 + 3 = 7
	 
  - Notes
  	Trivially, any array with a length of less than two automatically fails the test.
  	
  	Link: https://edabit.com/challenge/jbQDEAk7viqz2x4AX
 */
public class LuckySeven {

	public boolean luckySeven(int[] nums) {
		nums = IntStream.of(nums).distinct().toArray();
		
		if(nums.length < 3) return false;
		
	    Set<Integer> sums = new HashSet<>();
	    int n = nums.length;
	 
	    for (int i = 0; i < n - 1; i++) {
	       
	    	int goal = 7 - nums[i];
	        sums.clear();
	        
	        for (int j = i + 1; j < n; j++) {
	        	
	            if (sums.contains(goal - nums[j])) {
	                return true;
	            }
	            
	            sums.add(nums[j]);
	        }
	    }
	 
	    return false;
	}
	
	public static final void main(String[] args) {
		LuckySeven instance = new LuckySeven();
		int [] numbers = {0, -1, 8, 2, -49, 6};
		
		System.out.println(instance.luckySeven(numbers));
	}
}
