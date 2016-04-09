package algorithm.MoveZeroes.java;

import java.util.Arrays;

public class MoveZeroes {

	private static int[] nums;
	public static void main(String[] args) {
		nums = new int[] { 0, 1, 0, 3, 12 };
	    System.out.println("Original array:");
	    System.out.println(Arrays.toString(nums));
	    moveZeroes(nums);
	    System.out.println("After moveZeroes function array:");
	    System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes(int[] nums) {
	    int count = 0;
	    for(int i=0; i<nums.length; i++){
	      if(nums[i] == 0){
	        count++;
	      }else{
	        nums[i-count] = nums[i];
	      }
	    }
	    for(int i=0; i< count; i++){
	      nums[nums.length-1-i] = 0;
	    }
	  }
}
