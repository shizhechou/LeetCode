package algorithm.LongestIncreasingSubsequence.java;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
	    int size = 0;
	    for (int x : nums) {
	        int i = 0, j = size;
	        while (i != j) {
	            int m = (i + j) / 2;
	            if (dp[m] < x)
	                i = m + 1;
	            else
	                j = m;
	        }
	        dp[i] = x;
	        if (i == size) ++size;
	    }
	    return size;
    }
}
