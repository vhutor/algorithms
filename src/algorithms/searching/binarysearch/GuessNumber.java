package algorithms.searching.binarysearch;

/**
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 *
 * You call a pre-defined API int guess(int num), which returns three possible results:
 *
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 *
 * Link to source: https://leetcode.com/explore/learn/card/binary-search/125/template-i/951/
 * Possible solutions: https://leetcode.com/problems/guess-number-higher-or-lower/solution/
 * **/

public class GuessNumber {
    public int guessNumber(int num) {
        return guessNumber(1, num);
    }

    private int guessNumber(int begin, int end) {
        if (begin <= end) {
            int mid = begin + (end - begin)/2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) return guessNumber(begin, mid - 1);
            else return guessNumber(mid+1, end);
        }
        return -1;
    }

    // This function was designed in the link above
    public int guess(int num) {
        return 0;
    }
}
