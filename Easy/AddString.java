public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num2);
        System.out.println(num1);
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (len2 >= 0) {
            int sum = num1.charAt(len1) - '0' + num2.charAt(len2) - '0' + carry;
            carry = sum / 10;
            sb.append(sum%10);
            len2--;
            len1--;
        }
        while (len1 >= 0) {
            int sum = num1.charAt(len1) - '0' + carry;
            carry = sum / 10;
            sb.append(sum%10);
            len1--;
        }
        if (carry == 1) {
            sb.append("1");
        } 
        return sb.reverse().toString();
    }
}