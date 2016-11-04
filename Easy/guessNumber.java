/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return search(0, n);
    }
    private int search(int low, int high) {
        int median = low + (high-low)/2;
        if (guess(median) == -1) {
            return search(low, median-1);
        } 
        if (guess(median) == 1) {
            return search(median+1, high);
        }
        return median;
    }
}