package desafios;

/*
 
 A number is said to be Harshad if it's exactly divisible by the sum of its digits. 
 Create a function that determines whether a number is a Harshad or not. 
 
 - Examples
	isHarshad(75) ➞ false
	// 7 + 5 = 12
	// 75 is not exactly divisible by 12
 
	isHarshad(171) ➞ true
	// 1 + 7 + 1 = 9
	// 9 exactly divides 171
 
	isHarshad(481) ➞ true

	isHarshad(89) ➞ false

	isHarshad(516) ➞ true

	isHarshad(200) ➞ true
	
 Notes
	- You are expected to solve this challenge via recursion.

 */
public class HarshadNumber {

	public Integer recursiveSum(String[] digits, int index) {
		if( index == digits.length ) return 0;
		
		return Integer.valueOf(digits[index]) + recursiveSum(digits, index + 1);
	}
	
	public Boolean isHarshad(Integer number) {
		String[] digits = number.toString().split("");
		Integer sumDigits = recursiveSum(digits, 0);
		
		return (number % sumDigits) == 0;
	}
	
	public static void main(String[] args) {
		HarshadNumber harshadNumber = new HarshadNumber();
		Boolean isHarshadNumber = harshadNumber.isHarshad(200);
		
		System.out.println(isHarshadNumber);
	}
}
