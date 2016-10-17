public class Solution {
    public int getSum(int a, int b) {
        int result = b;
        for (;a != 0;) {
            result = a ^ result;
            a = (a & b) << 1;
            b = result;
        }
        return result;
    }
}