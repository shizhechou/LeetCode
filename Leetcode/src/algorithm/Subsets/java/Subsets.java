package algorithm.Subsets.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> resultList = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(resultList, new ArrayList<Integer>(), nums, 0);
		return resultList;

	}

	private void backtrack(List<List<Integer>> resultList, List<Integer> tmpList, int nums[], int start) {
		resultList.add(new ArrayList<>(tmpList));
		for (int i = start; i < nums.length; i++) {
			tmpList.add(nums[i]);
			backtrack(resultList, tmpList, nums, i + 1);
			tmpList.remove(tmpList.size() - 1);
		}
	}
}
