package algorithm.MaximumSubarray.java;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int len = nums.length;
		if (len == 0)
			return 0;
		int max = nums[0];
		int dp[] = new int[len];
		dp[0] = nums[0];

		for (int i = 1; i < len; i++) {
			dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
			max = Math.max(dp[i], max);
		}
		return max;
	}
}
