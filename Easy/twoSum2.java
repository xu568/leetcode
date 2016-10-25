public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = numbers.length-1;
        int sum = 0;
        while (result[0] < result[1]) {
        	sum = numbers[result[0]] + numbers[result[1]];
        	if (sum < target) {
        		result[0]++;
        	} else if (sum == target) {
        		break;
        	} else {
        		result[1] --;
        	}
        }
        result[0]++;
        result[1]++;
        return result;
    }
}