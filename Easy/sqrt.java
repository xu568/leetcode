public class Solution {
    public int mySqrt(int x) {
        int left = 1; 
        int right = x;
        int ret = 0;
        while (left <= right) {
            int median = left + (right-left)/2;
            if (median <= x/median) {
                left = median + 1;
                ret = median;
            } else {
                right = median - 1;
            }
        }
        return ret;
    }
}