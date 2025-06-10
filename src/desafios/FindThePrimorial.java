import java.util.*;
import java.lang.*;
import java.io.*;
/*
    A Primorial is a product of the first n prime numbers (e.g. 2 x 3 x 5 = 30). 2, 3, 5, 7, 11, 13 are prime numbers. 
    If n was 3, you'd multiply 2 x 3 x 5 = 30 or Primorial = 30.
    
    Create a function that returns the Primorial of a number.

    Examples
        primorial(1) ➞ 2
        
        primorial(2) ➞ 6
        
        primorial(8) ➞ 9699690
*/
class Main {
    public int primorial(int n){
        
		if( n <= 0 ) return 0;
	
		List<Integer> primeNumbers = new ArrayList<>();
		primeNumbers.add(2);

		if( n == 1 ) return primeNumbers.get(0);
        
    int result = primeNumbers.get(0);
    int i = 3;
        
		while( primeNumbers.size() < n ) {
          boolean flag = true;
              
    			for(Integer primeNumber: primeNumbers) {
    				
    				if( i % primeNumber == 0 && i != primeNumber){
                    flag = false;
                    break;
              };
    			}
    			
    			if(flag){
              primeNumbers.add(i);
              result *= i;
          }
    			
    			i++;
		  }

      return result;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        int result = main.primorial(8);
        
        System.out.println(result);
    }
}
