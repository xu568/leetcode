public class Solution {
    public String reverseString(String s) {
        if (s == null) return null;
      	int len = s.length();
      	char[] string = s.toCharArray();
      	char temp;
      	for (int i = 0; i <= len / 2 - 1; i++) {
      		temp = string[i];
      		string[i] = string[len-1-i];
      		string[len-1-i] = temp;
      	}
      	return new String(string);
    }
}