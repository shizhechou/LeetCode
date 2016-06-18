package algorithm.MergeSortedArray.java;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int insertPoint = m + n - 1;
		int nums1Point = m - 1;
		int nums2Point = n - 1;

		while (nums1Point >= 0 && nums2Point >= 0) {
			nums1[insertPoint--] = (nums1[nums1Point] > nums2[nums2Point]) ? nums1[nums1Point--] : nums2[nums2Point--];
		}

		while (nums2Point >= 0) {
			nums1[insertPoint--] = nums2[nums2Point--];
		}

	}
}
