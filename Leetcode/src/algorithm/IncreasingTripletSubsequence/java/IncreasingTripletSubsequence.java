package algorithm.IncreasingTripletSubsequence.java;

public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num <= min) {
				min = num;
			} else if (num < second_min) {
				second_min = num;
			} else if (num > second_min) {
				return true;
			}
		}
		return false;
	}
}
