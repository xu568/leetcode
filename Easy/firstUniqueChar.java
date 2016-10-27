public class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        int len = s.length();
        int[] counter = new int[26];
        int[] firstIndex = new int[26];
        for (int i = 0 ; i < len; i++) {
            int index = s.charAt(i) - 'a';
            if (counter[index] == 0) {
                firstIndex[index] = i;
            }
            counter[index]++;
        }
        int res = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < 26; i++) {
            if (counter[i] == 1 && firstIndex[i] < res) {
                res = firstIndex[i];
                found = true;
            }
        }
        if (found)
            return res;
        else
            return -1;
    }
}