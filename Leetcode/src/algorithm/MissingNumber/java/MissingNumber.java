package algorithm.MissingNumber.java;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int i = 0;
		int sum = 0;
		for (; i < nums.length; i++) {
			sum += i - nums[i];
		}
		sum += i;
		return sum;
	}
}
