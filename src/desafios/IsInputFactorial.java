package desafios;

/*
 
  Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.
  
  - Examples
	isFactorial(2) ➞ true
	// 2 = 2 * 1 = 2!
	
	isFactorial(27) ➞ false
	
	isFactorial(24) ➞ true
	// 24 = 4 * 3 * 2 * 1 = 4!
	
	
  - Notes
	No error handling is necessary. Inputs are all positive integers.
	Alternatively, you can solve this with a recursive approach.
	
  - link: https://edabit.com/challenge/DcatHxtrMfLxSWnDn
  
 */
public class IsInputFactorial {

	public Integer calculateFactorial(Integer input, Integer result, Integer index) {
		if( input <= result ) return result;
		result *= index;
		return  calculateFactorial(input, result, index + 1);
	}
	
	public Boolean isFactorial(Integer input) {
		Integer factorial = calculateFactorial(input, 1, 1);
	
		return factorial.equals(factorial);
	}
	
	final public static void main(final String[] args) {
		IsInputFactorial isInputFactorial = new IsInputFactorial();
		System.out.print(isInputFactorial.isFactorial(720));
	}
}
