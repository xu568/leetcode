public class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int sum = 0;
        int carry = 0;
        if (b.length() > a.length()) {
        	String temp = a;
        	a = b;
        	b = temp;
        }
        int pa = a.length() - 1;
        int pb = b.length() - 1;
        while (pb >= 0) {
        	sum = (int) (a.charAt(pa) - '0') + (b.charAt(pb) - '0') + carry;
            carry = sum / 2;
            sum = sum % 2;
            res = sum + res;
            pa--;
            pb--;
        }
        while (pa >= 0) {
            sum = (int) (a.charAt(pa) - '0') + carry;
            carry = sum / 2;
            sum = sum % 2;
            res = sum + res;
            pa--;
        }
        if (carry == 1) {
            res = 1 + res;
        }
        return res;
    }
}