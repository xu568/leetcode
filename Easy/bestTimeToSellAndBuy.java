public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
        	if (prices[i] < min) {
        		min = prices[i];
        	}
        	int diff = prices[i] - min;
        	if (profit < diff) {
        		profit = diff;
        	}
        }
        return profit;
    }
}