package algorithm.ContainsDuplicate.java;

import java.util.HashSet;

public class ContainsDuplicate {
	  public boolean containsDuplicate(int[] nums) {
		    HashSet<Integer> hs = new HashSet<Integer>();
		    for(int i=0; i< nums.length; i++){
		      if(hs.add(nums[i]) == false){
		        return true;
		      }
		    }
		    return false;
		  }
}
