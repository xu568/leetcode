public class Solution {
    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) return 0;
        int len = A.length;
        int total = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            total += i*A[i];
            sum += A[i];
        }
        max = Math.max(total, max);
        for (int i = 1; i < len; i++) {
            total += sum;
            total -= A.length*A[A.length-i];
            max = Math.max(total, max);
        }
        return max;
    }
}