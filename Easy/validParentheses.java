public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
        	return true;
        }
        Stack<Character> p = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
        	if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
        		p.push(s.charAt(i));
        	} else {
        		if (!p.isEmpty()) {
        			char temp = p.pop();
        			if (s.charAt(i) == ')') {
        				if (temp != '(')
        					return false;
        			}
        			if (s.charAt(i) == ']') {
        				if (temp != '[')
        					return false;
        			}
        			if (s.charAt(i) == '}') {
        				if (temp != '{')
        					return false;
        			}
        		} else 
        			return false;
        	}
        }
        if (p.isEmpty())
        	return true;
        else 
        	return false;
    }
}