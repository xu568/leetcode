public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        ArrayList<List<String>> res = new ArrayList<List<String>>();
        if (strings == null || strings.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strings) {
            StringBuilder sb = new StringBuilder();
            int len = s.length();
            for (int i = 1; i < len; i++) {
                sb.append(((s.charAt(i-1) - s.charAt(i))+26)%26);
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                map.get(key).add(s);
                map.put(key, map.get(key));
            } else {
                ArrayList<String> r = new ArrayList<String>();
                r.add(s);
                map.put(key, r);
            }
        }
        for (String key: map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }
}