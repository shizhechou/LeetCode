package algorithm.CombinationSum.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(resultList, new ArrayList<Integer>(), candidates, 0, target);
        return resultList;
    }
	
	private void backtrack(List<List<Integer>> resultList, List<Integer> tmpList, int nums[], int start, int target) {
		if(target > 0){
			for (int i = start; i < nums.length && target >= nums[i]; i++) {
				tmpList.add(nums[i]);
				backtrack(resultList, tmpList, nums, i, target-nums[i]);
				tmpList.remove(tmpList.size() - 1);
			}
		}else if (target == 0){
			resultList.add(new ArrayList<>(tmpList));
		}
	}
}
