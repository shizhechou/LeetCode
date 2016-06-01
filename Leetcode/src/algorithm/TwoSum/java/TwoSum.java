package algorithm.TwoSum.java;

import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		if (nums == null) {
			return null;
		}
		int tmp[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(tmp);

		int a = 0;
		int b = 0;
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int sum = tmp[start] + tmp[end];
			if (target == sum) {
				a = tmp[start];
				b = tmp[end];
				break;
			} else if (sum > target) {
				end--;
			} else if (sum < target) {
				start++;
			}
		}
		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == a) {
				result[0] = i;
				break;
			}
		}
		if (a != b) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == b) {
					result[1] = i;
					break;
				}
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == b && i != result[0]) {
					result[1] = i;
					break;
				}
			}
		}
		return result;
	}
}
