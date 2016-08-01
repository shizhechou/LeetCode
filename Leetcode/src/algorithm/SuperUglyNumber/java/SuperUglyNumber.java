package algorithm.SuperUglyNumber.java;

public class SuperUglyNumber {
	// Base on 264. Ugly Number II
	// https://leetcode.com/problems/ugly-number-ii/
	public int nthSuperUglyNumber(int n, int[] primes) {
		int sugly[] = new int[n];
		sugly[0] = 1;
		int k = primes.length;
		int factor[] = new int[k];

		for (int i = 1; i < n; i++) {
			int j = 0;
			int current = sugly[factor[j]] * primes[j];
			for (j = 1; j < k ; j++) {
				current = Math.min(sugly[factor[j]] * primes[j], current);
			}
			sugly[i] = current;
			for(int l=0; l<k; l++){
				if(current == sugly[factor[l]]*primes[l]){
					factor[l]++;
				}
			}
		}
		return sugly[n-1];
	}
}
