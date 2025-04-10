package desafios;


/*
 
 Create a recursive function that determines whether a word is a palindrome or not.
 
 - Examples
	isPalindrome("madam") ➞ true
	
	isPalindrome("adieu") ➞ false
	
	isPalindrome("rotor") ➞ true
- Notes
	All inputs are in lowercase.
	You are expected to solve this challenge via recursion.
	
 */
public class IsPalindromeRecursion {

	String generateStringRecursive(String[] letters, int init) {
		if(init == -1) return "";
		return letters[init] + generateStringRecursive(letters, init - 1);
	}
	
	Boolean isPalindorme(String word) {
		String [] letters = word.split("");
		String reverseWord = generateStringRecursive(letters, letters.length - 1);
		return word.equals(reverseWord);
	}
	
	final public static void main(final String...args) {
		IsPalindromeRecursion isPalindromeRecursion = new IsPalindromeRecursion();
		System.out.println(isPalindromeRecursion.isPalindorme("ada"));
	}
}
