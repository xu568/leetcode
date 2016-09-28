public class Solution {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
        	return path;
        }
        String[] list = path.split("/");
        String[] p = new String[list.length];
        int counter = 0;
        for (String s : list) {
        	if (s.length() == 0 || s.equals(".")) {
        		continue;
        	}
        	if (!s.equals("..")) {
        		p[counter++] = s;
        	} else {
        		if (counter > 0)
        			counter --;
        	}
        }
        if (counter == 0) 
        	return "/";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counter; i++) {
        	sb.append("/");
        	sb.append(p[i]);
        }
        return sb.toString();
    }
}