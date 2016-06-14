package algorithm.ProductOfArrayExceptSelf.java;

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int result[] = new int[len];
		result[0] = 1;
		for (int i = 1; i < len; i++) {
			result[i] = nums[i - 1] * result[i - 1];
		}
		for (int j = len - 1; j > 0; j--) {
			result[j] = result[0] * result[j];
			result[0] *= nums[j];
		}
		return result;
	}

}
