package desafios;


/*
    Write a function that returns the number of ways a person can climb n stairs, where the person may only climb 1 or 2 steps at a time.

	To illustrate, if n = 4 there are 5 ways to climb:
	n = 0 -> 1
	
	n = 1
	[1] -> 1
	
	n = 2
	-> 1 + 1 = 2
	[1,1]
	[2]
	
	n = 3
	[1,1,1]
	[1,2]
	[2,1]
	-> 1 + 2 = 3
	
	n = 4
	[1, 1, 1, 1]
	[2, 1, 1]
	[1, 2, 1]
	[1, 1, 2]
	[2, 2]
	-> 3 + 2 = 5
	
	n = 5
	[1,1,1,1,1]
	[2,1,1,1]
	[1,2,1,1]
	[1,1,2,1]
	[1,1,1,2]
	[2,2,1]
	[2,1,2]
	[1,2,2]
	-> 5 + 3 = 8
	
	Examples:
		waysToClimb(1) ➞ 1
		waysToClimb(2) ➞ 2
		waysToClimb(5) ➞ 8
		
	Notes:
		A staircase of height 0 should return 1.
		
	Link: https://edabit.com/challenge/YuZYMkwnJpALmHELB
 */
public class StaircaseOfRecursion {

	public int waysToClimb(int n) {
		
		if(n == 0 || n == 1) return 1;
		
		
		return waysToClimb(n - 1) + waysToClimb(n - 2);
	}
	
	public static void main(String...args) {
		StaircaseOfRecursion stairCase = new StaircaseOfRecursion();
		
		int result = stairCase.waysToClimb(7);
		System.out.print(result);
	}
}
