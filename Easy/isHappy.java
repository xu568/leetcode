public class Solution {
    public boolean isHappy(int n) {
        String number = Integer.toString(n);
        HashSet<Integer> set = new HashSet<Integer>();
        while(true) {
            int sum = 0;
            int len = number.length();
            for (int i = 0; i < len; i++) {
                sum += (number.charAt(i) - '0')*(number.charAt(i) - '0');
            }
            if (sum == 1) {
                return true;
            }
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
                number = Integer.toString(sum);
            }
        }
    }
}