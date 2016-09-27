/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

/* Very elegant way of using priority queue!!
*/
public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
        	public int compare(Interval i1, Interval i2) {
        		return i1.start - i2.start;
        	}
        });
        int rooms = 1;
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        minheap.add(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {
        	if (minheap.peek() <= intervals[i].start) {
        		minheap.poll();
        		minheap.add(intervals[i].end);
        	} else {
        		minheap.add(intervals[i].end);
        		rooms++;
        	}
        }
        return rooms;
    }
}