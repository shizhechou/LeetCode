package algorithm.WiggleSubsequence.java;

public class WiggleSubsequence {
	public int wiggleMaxLength(int[] nums) {
        if(nums.length<2)
            return nums.length;
       int maxLen=1;
       boolean increasing = nums[1]>nums[0];
       int prev = nums[0];
       
       for(int i=1; i<nums.length; i++){
           if(increasing){
               if(nums[i] >prev){
                   increasing = !increasing;
                   maxLen++;
               }
           } else {
               if(nums[i] < prev){
                   increasing = !increasing;
                   maxLen++;
               }
           }
           prev = nums[i];
       }
       return maxLen;
    }
}
