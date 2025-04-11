package desafios;

import java.util.ArrayList;
import java.util.List;

/*
 
  Create a function that finds how many prime numbers there are, up to the given integer.
  
  Examples
	primeNumbers(10) ➞ 4
	// 2, 3, 5 and 7
	
	primeNumbers(20) ➞ 8
	// 2, 3, 5, 7, 11, 13, 17 and 19
	
	primeNumbers(30) ➞ 10
	// 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29

 */
public class HowManyPrimeNumbersAreThere {
	
	public int primeNumbers(int limit) {
	
		if( limit < 2 ) return 0;

		List<Integer> primeNumbers = new ArrayList<>();
		primeNumbers.add(2);
		
		if( limit == 2) return primeNumbers.size();
		
		int i = 3;
		
		while( i  <= limit ) {
			boolean flag = true;
			
			for(Integer primeNumber: primeNumbers) {
				
				if( i % primeNumber == 0) {
					flag = false;
					break;
				}
				
			}
			
			if(flag) primeNumbers.add(i);
			
			i++;
		}
		
		return primeNumbers.size();
	}
	
	public static void main(String... args) {
		HowManyPrimeNumbersAreThere countNumbers = new HowManyPrimeNumbersAreThere();
		System.out.print(countNumbers.primeNumbers(30));
	}

}
