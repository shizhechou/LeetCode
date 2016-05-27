package algorithm.RangeSumQueryImmutable.java;

public class RangeSumQueryImmutable {

	private int[] sum;
	
	public static void main(String[] args) {
		int nums[] = new int[]{-2, 0, 3, -5, 2, -1};
		RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
		System.out.println("Range 0:3 ="+numArray.sumRange(0, 3));
		System.out.println("Range 2:3 ="+numArray.sumRange(2, 3));
		System.out.println("Range 1:4 ="+numArray.sumRange(1, 4));
	}
	// DP solution to save summary
	public RangeSumQueryImmutable(int[] nums) {
        for(int i=1; i< nums.length; i++){
        	nums[i]+=nums[i-1];
        }
        sum = nums;
    }

    public int sumRange(int i, int j) {
        return i == 0 ? sum[j]:sum[j]-sum[i-1];
    }
}
