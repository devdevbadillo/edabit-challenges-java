package desafios;

import java.util.Arrays;

/*
    You have a pack of 5 randomly numbered cards, which can range from 0-9. You can win if you can produce a higher two-digit number from your cards
    than your opponent. Return true if your cards win that round.

    Examples
        winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
        // Your cards can make the number 96
        // Your opponent can make the number 73
        // You win the round since 96 > 73

        winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true

        winRound([1, 2, 3, 4, 5], [9, 8, 7, 6, 5]) ➞ false

        winRound([4, 3, 4, 4, 5], [3, 2, 5, 4, 1]) ➞ false

      Link: https://edabit.com/challenge/qE9gCJtrtcMurvQtT
 */
public class NumberedCards {

    public Boolean winRound(int [] myCards, int [] opponentCards) {
        Arrays.sort(myCards);
        Arrays.sort(opponentCards);

        String myHigherSum = String.valueOf(myCards[myCards.length - 1]) + String.valueOf(myCards[myCards.length - 2]);
        String opponentHigherSum = String.valueOf(opponentCards[opponentCards.length - 1]) + String.valueOf(opponentCards[opponentCards.length - 2]);

        return myHigherSum.compareTo(opponentHigherSum) > 0;
    }

    public static void main(String[] args) {
        int [] myCards =  new int[]{1, 2, 3, 4, 5};
        int [] opponentCards = new int[]{9, 8, 7, 6, 5};

        NumberedCards numberedCards = new NumberedCards();
        Boolean winRound = numberedCards.winRound(myCards, opponentCards);

        System.out.println(winRound);
    }
}
