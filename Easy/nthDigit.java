public class Solution {
    public int findNthDigit(int n) {
        long counter = 9;
        int lvl = 1;
        while (n > counter*lvl) {
            n -= counter*lvl;
            lvl++;
            counter *= 10;
        }
        int number = (int)Math.pow(10, lvl-1) + (n-1)/lvl;
        return (""+number).toCharArray()[(n-1)%lvl] - '0';
    }
}