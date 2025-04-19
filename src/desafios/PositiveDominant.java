package desafios;

import java.util.ArrayList;
import java.util.List;

/*
    An array is positive dominant if it contains strictly more unique positive values than unique negative values.
    Write a function that returns true if an array is positive dominant, false, otherwise.

    Examples
        isPositiveDominant([1, 1, 1, 1, -3, -4]) ➞ false
        // There is only 1 unique positive value (1).
        // There are 2 unique negative values (-3, -4).

        isPositiveDominant([5, 99, 832, -3, -4]) ➞ true

        isPositiveDominant([5, 0]) ➞ true

        isPositiveDominant([0, -4, -1]) ➞ false

    Notes
        0 counts as neither a positive nor a negative value.

    Link: https://edabit.com/challenge/zi3zKpBLYHqtmSf5m
 */
public class PositiveDominant {

    public void filterUniqueElements(int[] arr, List<Integer> uniqueElements) {
        for(int number: arr){
            if(!uniqueElements.contains(number)){
                uniqueElements.add(number);
            }
        }
    }

    public boolean isPositiveDominant(int[] arr) {
        List<Integer> uniqueElements = new ArrayList<>();
        filterUniqueElements(arr, uniqueElements);

        int countPositive = 0;
        int countNegative = 0;

        for(Integer number: uniqueElements){
            if (number > 0){
                countPositive++;
            } else if (number < 0){
                countNegative++;
            }else{
                continue;
            }
        }

        return  countPositive > countNegative;
    }

    public static void main(String[] args) {

        PositiveDominant positiveDominant = new PositiveDominant();
        int[] arr = {1, 1, 1, 1, -3, -4};
        System.out.println(positiveDominant.isPositiveDominant(arr));

    }
}
