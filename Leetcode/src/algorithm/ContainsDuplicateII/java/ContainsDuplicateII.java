package algorithm.ContainsDuplicateII.java;

import java.util.HashSet;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		int nums[] = { 1, 0, 2, 3, 2 };
		System.out.println("nums[] containsNearbyDuplicate(nums,1) is " + containsNearbyDuplicate(nums, 1));
		System.out.println("nums[] containsNearbyDuplicate(nums,2) is " + containsNearbyDuplicate(nums, 2));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (hs.add(nums[i]) == false)
				return true;
			if (hs.size() == k + 1)
				hs.remove(nums[i - k]);
		}

		return false;
	}

}
