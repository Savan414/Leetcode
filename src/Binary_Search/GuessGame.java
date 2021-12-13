package Binary_Search;

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessGame {

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        return bsearch(1, n);
    }

    private static int bsearch(int start, int end) {

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(guess(mid) == 0)
            {
                return mid;
            }
            else if(guess(mid) == -1)
            {
                end = mid;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    private static int guess(int mid) {
        return -1;
    }
}
