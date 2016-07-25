package algorithm.UglyNumberII.java;

public class UglyNumberII {
	public int nthUglyNumber(int n) {
		int ugly[] = new int[n];
		ugly[0] = 1;
		int f2 = 0;
		int f3 = 0;
		int f5 = 0;

		for (int i = 1; i < n; i++) {
			ugly[i] = Math.min(Math.min(ugly[f2] * 2, ugly[f3] * 3), ugly[f5] * 5);
			if (ugly[i] == ugly[f2] * 2)
				f2++;
			if (ugly[i] == ugly[f3] * 3)
				f3++;
			if (ugly[i] == ugly[f5] * 5)
				f5++;
		}
		return ugly[n - 1];
	}
}
