public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int len = words.length;
        int distance = len;
        int i = 0;
        while (i < len) {
            if (word1.equals(words[i])) {
                index1 = i;
                if (index2 != -1) {
                    distance = distance > (index1 - index2)? (index1-index2) : distance;
                }
            } 
            if (word2.equals(words[i])) {
                index2 = i;
                if (index1 != -1) {
                    distance = distance > (index2 - index1)? (index2-index1) : distance;
                }
            } 
            i++;
        }
        return distance;
    }
}