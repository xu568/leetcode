public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (s == null || s.length() == 0) return true;
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        for (int i = 0; i < s.length(); i++) {
        	String temp = s.substring(0, i+1);
        	for (int j = 0; j <= i; j++) {
        		if (res[j] == true && wordDict.contains(temp.substring(j+1))) {
        			res[i] = true;
        			break;
        		}
        	} 
        }
        return res[s.length()];
    }
}