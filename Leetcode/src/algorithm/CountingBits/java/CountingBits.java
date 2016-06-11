package algorithm.CountingBits.java;

public class CountingBits {

	// DP algorithm
	// 2^1=2(10), 2^2=4(100), 2^3=8(1000) has one bit 1
	// and next num is previous bum + 1
	// 9(1001) = 8(1000) + 1 = 2
	// Base on this theory
	// 8(1000) = 4(100) = 2(10) = 1
	// and then check the last is 1 or not.
	public int[] countBits(int num) {
		int res[] = new int[num + 1];
		res[0] = 0;
		for (int i = 1; i <= num; i++) {
			res[i] = res[i >> 1] + (i & 1);
		}
		return res;
	}
}
