package algorithm.ProductOfArrayExceptSelf.java;

public class ProductOfArrayExceptSelf {

	// [1,2,3,4] => [a1*a2*a3, a0*a2*a3, a0*a1*a3, a0*a1*a2] => [24,12,8,6]
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int result[] = new int[len];
		result[0] = 1;
		// 1. First loop to calculate multiple before self index
		// EX: [1,a0,a0*a1,a0*a1*a2]
		for (int i = 1; i < len; i++) {
			result[i] = nums[i - 1] * result[i - 1];
		}
		// 2. Second loop to calculate multiple after self index
		// EX: [a1*a2*a3, a0*a2*a3, a0*a1*a3, a0*a1*a2]
		for (int j = len - 1; j > 0; j--) {
			result[j] = result[0] * result[j];
			result[0] *= nums[j];
		}
		return result;
	}

}
