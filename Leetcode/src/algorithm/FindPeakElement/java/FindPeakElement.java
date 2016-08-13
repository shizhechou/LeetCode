package algorithm.FindPeakElement.java;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		return binarySearch(nums, 0, nums.length - 1);
	}

	public int binarySearch(int[] nums, int start, int end) {
		if (start == end) {
			return start;
		} else if (start + 1 == end) {
			if (nums[start] < nums[end]) {
				return end;
			} else {
				return start;
			}
		} else {
			int m = (start + end) / 2;
			if ((nums[m] > nums[m - 1]) && (nums[m] > nums[m + 1])) {
				return m;
			} else if ((nums[m - 1] > nums[m]) && (nums[m] > nums[m + 1])) {
				return binarySearch(nums, start, m - 1);
			} else {
				return binarySearch(nums, m + 1, end);
			}
		}
	}
}
