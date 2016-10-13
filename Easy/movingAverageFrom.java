public class MovingAverage {

    /** Initialize your data structure here. */
    LinkedList<Integer> q;
    int sum;
    int length;
    public MovingAverage(int size) {
        q = new LinkedList<Integer>();
        length = size;
        sum = 0;
    }
    
    public double next(int val) {
        if (q.size() < length) {
        	sum += val;
 			q.add(val);
        } else {
        	int value = q.poll();
        	sum -= value;
        	q.add(val);
        	sum += val;
        }
        return (double)sum / (double) q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */