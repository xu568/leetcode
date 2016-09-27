public class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int o = B[0].length;
        // Result should be a m*k matrix
        int[][] result = new int[m][o];
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < o; j++) {
        		for (int k = 0; k < n; k++) {
        			if (A[i][k] != 0 && B[k][j] != 0)
        				result[i][j] += A[i][k]*B[k][j];
        		}
        	}
        }
        return result;
    }
}