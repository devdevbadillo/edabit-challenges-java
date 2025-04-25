package desafios;

/*
 	
 	Create a function that returns the sum of the digits formed from the first and last digits, all the way to the center of the number.

	Worked Example
	closingInSum(2520) ➞ 72
	
	// The first and last digits are 2 and 0.
	// 2 and 0 form 20.
	// The second digit is 5 and the second to last digit is 2.
	// 5 and 2 form 52.
	
	// 20 + 52 = 72
	 
	Examples
		closingInSum(121) ➞ 13
		// 11 + 2
		
		closingInSum(1039) ➞ 22
		// 19 + 3
		
		closingInSum(22225555) ➞ 100
		// 25 + 25 + 25 + 25
		 
	Notes
		- If the number has an odd number of digits, simply add on the single-digit number in the center (see example #1).
		- Any number which is zero-padded counts as a single digit (see example #2). 
		
	Link: https://edabit.com/challenge/EhX7SGqPTyxQc4pb2

 */
public class ClosingInSum {
	
	public int closingInSum(int number) {
		String [] digits = String.valueOf(number).split("");
		
		int count = 0;
		int i = 0;
		int sum = 0;
		
		while( count != digits.length ) {
			
			String first = digits[i++];
			
			count++;
			
			if(count == digits.length) {
				sum += Integer.valueOf(first);
				break;
			};
			
			String second = digits[digits.length - i];
			
			sum += Integer.valueOf(first + second);
			
			count++;
		}
		
		return sum;
	}
	
	public static void main (String [] args) {
		ClosingInSum closingInSum = new ClosingInSum();
		
		int result = closingInSum.closingInSum(121);
		
		System.out.print(result);
	}
}
