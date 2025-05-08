package desafios;

/*
 
 	Create a function that takes a string and returns the number of alphanumeric characters that occur more than once.

	Examples
		duplicateCount("abcde") ➞ 0
		
		duplicateCount("aabbcde") ➞ 2
		
		duplicateCount("Indivisibilities") ➞ 2
		
		duplicateCount("Aa") ➞ 0 // Case sensitive
		
	Notes
		Duplicate characters are case sensitive.
		The input string will contain only alphanumeric characters.
 */
public class CountNumberOfDuplicateCharacters {

	public int duplicateCount(String characters) {
		int count = 0;
		int init = 0;
		int end = 0;
		
		while(characters.length() > 0) {
			init = characters.length();
			int i = 0;
			
			characters = characters.replaceAll(String.valueOf(characters.charAt(i)), "");
			
			end = characters.length();
			
			if(init - end > 1){
				count++;
			}
			
			i++;
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
	
		CountNumberOfDuplicateCharacters duplicateCharacters = new CountNumberOfDuplicateCharacters();
		
		String characters = "aawwpcmmSAnA";
		int result = duplicateCharacters.duplicateCount(characters);
		
		System.out.print(result);
	}

}
