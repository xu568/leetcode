public class Solution {
    public boolean validWordSquare(List<String> words) {
        if (words == null || words.size() == 0) return true;
        int len = words.size();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j >= words.size()) {
                    return false;
                }
                if (i >= words.get(j).length()) {
                    return false;
                }
                if (words.get(i).charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}