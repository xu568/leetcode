public class Solution {
    public boolean isStrobogrammatic(String num) {
        if (num == null || num.length() == 0) return true;
        int len = num.length();
        int left = 0;
        int right = len-1;
        while (left <= right) {
            switch(num.charAt(left)) {
                case '0':
                    if (num.charAt(right)!= '0') {
                        return false;
                    }
                    break;
                case '1':
                    if (num.charAt(right) != '1') {
                        return false;
                    }
                    break;
                case '6':
                    if (num.charAt(right) != '9') {
                        return false;
                    }
                    break;
                case '8':
                    if (num.charAt(right) != '8') {
                        return false;
                    }
                    break;
                case '9':
                    if (num.charAt(right) != '6') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}