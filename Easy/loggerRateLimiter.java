public class Logger {

    /** Initialize your data structure here. */
    HashMap<String, Integer> map;
    public Logger() {
        map = new HashMap<String, Integer>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (map.get(message) == null) {
        	map.put(message, timestamp);
        	return true;
        } else {
        	int time = map.get(message);
        	if (timestamp - time >= 10) {
        		map.put(message, timestamp);
        		return true;
        	} else {
        		return false;
        	}
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */