public class Solution {
    public String countAndSay(int n) {
        if (n == 0) return "";
        String s = "1";
        for (int i = 0; i < n-1; i++) {
        	s = getNext(s);
        }
        return s;
    }
    private String getNext(String s) {
    	char[] array = s.toCharArray();
        int length = array.length;
        String result = "";
        for (int i = 0; i < length; i++) {
        	char a = array[i];
        	int counter = 1;
        	for (int j = i+1; j < length; j++) {
        		if (a == array[j]) {
        			counter ++;
        		} else 
        			break;
        	}
        	result += counter;
        	result += a;
        	i += counter - 1;
        }
        return result;
    }
}