package algorithm.RotateArray.java;

public class RotateArray {

	public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1); // reverse all
        reverse(nums, 0, k-1);	   // reverse left fragment
        reverse(nums, k, len - 1); // reverse right fragment
        
    }
	
	public void reverse(int[] nums, int l, int r){
		int temp = 0;
		while(l < r){
			temp = nums[l];
			nums[l++] = nums[r];
			nums[r--] = temp;
		}
	}

}
