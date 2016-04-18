package algorithm.MajorityElement.java;

import java.util.Arrays;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
	
	public static void main(String[] args) {
		// Test info
        int test1[] = {1,3,4,1,1};
        int test2[] = {3,7,2,1,2,3,5,2,2};
        System.out.println("test1:"+test1.toString());
        System.out.println("test1 Majority Element:"+majorityElement(test1));
        System.out.println("test2:"+test2.toString());
        System.out.println("test2 Majority Element:"+majorityElement(test2));
    }
}
