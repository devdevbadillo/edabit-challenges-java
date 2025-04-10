package desafios;

/*
 Create a function that takes an array of increasing letters and return the missing letter.
 
 Examples.
	missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"

	missingLetter(["O", "Q", "R", "S"]) ➞ "P"

	missingLetter(["t", "u", "v", "w", "x", "z"]) ➞ "y"

	missingLetter(["m", "o"]) ➞ "n"

 Notes 
	- Tests will always have exactly one letter missing.
	- The length of the test array will always be at least two.
	- Tests will be in one particular case (upper or lower but never both).

 Link: https://edabit.com/challenge/4hZ9cHgvkZ94sr2ae
 */

public class FindMissingLetter {
	final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public Integer findLetter(String letter) {
		return alphabet.indexOf(letter.toLowerCase());
	}
	
	public Integer incompleteSum(String[] letters) {
		Integer incomplete = 0;
		int index = 0;
		
		while(index < letters.length) {
			incomplete += findLetter(letters[index]);
			index++;
		}
		
		return incomplete;
	}
	
	public Integer totalSum(Integer start, Integer end) {
		Integer total = 0;
		
		for(int i = start; i <= end; i++) {
			total += i;
		}
		
		return total;
	}
	
	public Character getLetterMissing(String [] letters) {
		Integer start = findLetter(letters[0]);
		Integer end = findLetter(letters[letters.length - 1]);
		
		Character missingLetter = alphabet.charAt(totalSum(start, end) - incompleteSum(letters));
		return letters[0].equals(letters[0].toLowerCase()) ? missingLetter : Character.toUpperCase(missingLetter);
	}
	
	public static final void main(final String[] args) {
		FindMissingLetter findLetterMissing = new FindMissingLetter();
		String [] letters = new String[]{"O", "Q", "R", "S"};
		
		Character letterMissing = findLetterMissing.getLetterMissing(letters);
		System.out.println(letterMissing);
	}
}
