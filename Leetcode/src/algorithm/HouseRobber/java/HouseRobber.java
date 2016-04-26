package algorithm.HouseRobber.java;

public class HouseRobber {

	public int rob(int[] nums) {
        //DP algorithm dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        int size = nums.length;
        if(size == 0) return 0;
        if(size == 1) return nums[0];
        if(size == 2) return Math.max(nums[0],nums[1]);
        int minusOne = Math.max(nums[0],nums[1]);
        int minusTwo = nums[0];
        int result = 0;
        for(int i = 2; i< size; i++){
            result = Math.max(minusOne, minusTwo+nums[i]);
            minusTwo = minusOne;
            minusOne = result;
        }
        return result;
    }
}
