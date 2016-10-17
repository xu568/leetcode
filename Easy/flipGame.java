public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new LinkedList<String>();
        if (s == null || s.length() < 2) return res;
        int length = s.length();
        for (int i = 0; i < length - 1; i++) {
        	if (s.charAt(i) == '+' && s.charAt(i+1) == '+') {
        		if (i+2 < length)
        			res.add(s.substring(0,i) + "--" + s.substring(i+2));
        		else
        			res.add(s.substring(0,i) + "--");
        	}
        }
        return res;
    }
}