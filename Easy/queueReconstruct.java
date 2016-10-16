public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // Sort people descending order and k asending order
        Arrays.sort(people, new Comparator<int[]>() {
        	public int compare(int[] o1, int[] o2) {
        		return o1[0] != o2[0]? o2[0]-o1[0] : o1[1] - o2[1];
        	}
        });
        List<int[]> res = new LinkedList<int[]>();
        for (int[] person : people) {
        	if (person[1] >= res.size()) {
        		res.add(person);
        	} else {
        		res.add(person[1], person);
        	}
        }
        return res.toArray(new int[people.length][]);
    }
}