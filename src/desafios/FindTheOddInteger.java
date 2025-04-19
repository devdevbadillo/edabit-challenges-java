package desafios;

/*
    Create a function that takes an array and finds the integer which appears an odd number of times.

    Examples
        findOdd([-2, 5, 4, 4, -1, -2, 5]) ➞ -1

        findOdd([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]) ➞ 5

        findOdd([10]) ➞ 10

    Notes
        There will always only be one integer that appears an odd number of times.

    Link: https://edabit.com/challenge/8SHAyg8kdX8y72S3z
 */
public class FindTheOddInteger {

    /*
        El operador XOR tiene las siguientes propiedades:
            a ^ a = 0 (para cualquier número)
            0 ^ a = a (XOR con cero devuelve el mismo número)
            a ^ b ^ a = b (XOR es conmutativo y asociativo)

        Utilizando estás propiedades, tenemos lo siguiente:

        -2 ^ 5 ^ 4 ^ 4 ^ -1 ^ -2 ^ 5
        = (-2 ^ -2) ^ (5 ^ 5) ^ (4 ^ 4) ^ -1
        = 0 ^ 0 ^ 0 ^ -1
        = 0 ^ -1
        = -1
     */
    public int findOdd(int[] arr) {
        int odd = 0;
        for (int j : arr) {
            odd ^= j;
        }
        return odd;
    }

    public static void main(String[] args) {
        FindTheOddInteger findTheOddInteger = new FindTheOddInteger();
        System.out.println(findTheOddInteger.findOdd(new int[]{-2, 5, 4, 4, -1, -2, 5}));
    }
}
