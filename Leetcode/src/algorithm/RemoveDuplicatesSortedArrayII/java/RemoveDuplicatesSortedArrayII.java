package algorithm.RemoveDuplicatesSortedArrayII.java;

public class RemoveDuplicatesSortedArrayII {
	public int removeDuplicates(int[] nums) {
        int x = 0;
        for(int n : nums){
            if(x < 2 || n > nums[x-2] ){
                nums[x++] = n;
            }
        }
        return x;
    }
}
