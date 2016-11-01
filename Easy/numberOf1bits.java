public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter = 0;
        int bit = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & bit) != 0) {
                counter += 1;
            }
            bit = (bit << 1);
        }
        return counter;
    }
}