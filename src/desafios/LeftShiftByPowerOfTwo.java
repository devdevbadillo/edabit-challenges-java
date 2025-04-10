package desafios;

/*
  The left shift operation is similar to multiplication by powers of two, thus, 
  the process is repetitive and can be done recursively.

  Sample calculation using the left shift operator (<<):

	10 << 3 = 10 * 2^3 = 10 * 8 = 80
	-32 << 2 = -32 * 2^2 = -32 * 4 = -128
	5 << 2 = 5 * 2^2 = 5 * 4 = 20
	
  - Examples
  
	shiftToLeft(5, 2) ➞ 20
	
	shiftToLeft(10, 3) ➞ 80
	
	shiftToLeft(-32, 2) ➞ -128
	
	shiftToLeft(-6, 5) ➞ -192
	
	shiftToLeft(12, 4) ➞ 192
	
	shiftToLeft(46, 6) ➞ 2944
	
  - Notes
	There will be no negative values for the second parameter y.
	You are expected to solve this challenge via recursion.
	
  - Link: https://edabit.com/challenge/whdNuCbR69fpLhbBv
 */
public class LeftShiftByPowerOfTwo {

	public int calculatePowerRecursive(int power) {
		if(power == 0) return 1;
		return (2 * calculatePowerRecursive(power - 1));
	}
	
	public int leftShiftPower(int mult, int power) {
		return mult * calculatePowerRecursive(power);
	}
	
	public final static void main(String[] args) {
		LeftShiftByPowerOfTwo leftShiftByPowerOfTwo = new LeftShiftByPowerOfTwo();
		int mult = 46;
		int power = 6;
		
		System.out.println(leftShiftByPowerOfTwo.leftShiftPower(mult, power));
	}
}
