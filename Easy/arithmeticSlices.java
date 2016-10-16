public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) return 0;
        int length = A.length;
        int res = 0;
        for (int i = 0; i < length - 2; i++) {
        	if (A[i+1] - A[i] == A[i+2] - A[i+1]) {
        		int n = 3;
        		int diff = A[i+1] - A[i];
        		while (i + n < length && A[i+n] - A[i+n-1] == diff) {
        			n++;
        		}
        		res += (n-2)*(n-1) / 2;
        		i += n-1;
        	}
        }
        return res;
    }
}