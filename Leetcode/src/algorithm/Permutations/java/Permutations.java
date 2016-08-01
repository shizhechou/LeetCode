package algorithm.Permutations.java;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		dfs(res, nums, 0);
		return res;
	}

	private void dfs(List<List<Integer>> res, int[] nums, int j) {
		if (j == nums.length) {
			List<Integer> tmp = new ArrayList<Integer>();
			for (int num : nums)
				tmp.add(num);
			res.add(tmp);
		}
		for (int i = j; i < nums.length; i++) {
			swap(nums, i, j);
			dfs(res, nums, j+1);
			swap(nums, i, j);
		}

	}

	private void swap(int[] nums, int m, int n) {
		int temp = nums[m];
		nums[m] = nums[n];
		nums[n] = temp;
	}
}
