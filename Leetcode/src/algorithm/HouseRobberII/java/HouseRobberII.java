package algorithm.HouseRobberII.java;

public class HouseRobberII {
	public int rob(int[] nums) {
        if(nums.length == 1)
        	return nums[0];
        return Math.max(rob(nums, 0, nums.length-2), rob(nums,1,nums.length-1));
    }
	
	public int rob(int[] nums, int start, int end) {
        int minusOne = 0;
        int minusTwo = 0;
        for(int j=start; j<=end; j++){
        	int i = minusOne;
        	int e = minusTwo;
        	minusOne = e + nums[j];
        	minusTwo = Math.max(e, i);
        }
        return Math.max(minusOne, minusTwo);
    }
}
