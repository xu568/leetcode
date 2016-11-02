public class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        int len = s.length();
        char[] array = s.toCharArray();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (isVowel(array[left]) && isVowel(array[right])) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            } else if (isVowel(array[left])) {
                right--;   
            } else if (isVowel(array[right])) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return new String(array);
    }
    private boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a =='U';
    }
}