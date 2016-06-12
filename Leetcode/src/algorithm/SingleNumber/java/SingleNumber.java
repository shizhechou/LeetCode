package algorithm.SingleNumber.java;

public class SingleNumber {

	// Just one num in array is signal, others are double.
	// So use XOR to add all num in array
	public int singleNumber(int[] nums) {
		int res = 0;
		for (int num : nums) {
			res ^= num;
		}
		return res;
	}
}
