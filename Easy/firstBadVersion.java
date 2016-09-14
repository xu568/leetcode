/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return findFirstBadVersion(1, n);
    }	
    private int findFirstBadVersion(int low, int high) {
    	if (low == high) return low;
    	int median = low + (high-low)/2;
    	if (isBadVersion(median)) {
    		if (!isBadVersion(median-1)) {
    			return median;
    		} else {
    			return findFirstBadVersion(low, median-1);
    		}
    	} else {
    		if (isBadVersion(median+1)) {
    			return median+1;
    		} else 
    			return findFirstBadVersion(median+1, high);
    	}
    }
}