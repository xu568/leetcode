public class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i*i < n; i++) {
            if (notPrime[i] == false) {
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (!notPrime[i]) {
                result++;
            }
        }
        return result;
    }
}