public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x > 0 && x%10 == 0) return false;
        return compare(x, 0);
    }
    private boolean compare(int a, int b) {
        if (b > a) return false;
        if (a == b || a/10 == b) return true;
        b = b*10 + a%10;
        a = a/10;
        return compare(a, b);
    }
}