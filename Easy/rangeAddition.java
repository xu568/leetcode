public class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        if (updates == null || updates.length == 0) return res;
        int len = updates.length;
        for (int i = 0; i < len; i++) {
        	res[updates[i][0]] += updates[i][2];
        	if (updates[i][1] != length - 1) {
        		res[updates[i][1]+1] -= updates[i][2];
        	}
        }
        int total = 0;
        for (int i = 0; i < length; i++) {
        	total += res[i];
        	res[i] = total;
        }
        return res;
    }
}