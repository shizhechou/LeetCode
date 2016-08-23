package algorithm.HIndex.java;

import java.util.Arrays;

public class HIndex {
	// https://zh.wikipedia.org/wiki/H%E6%8C%87%E6%95%B0
	public int hIndex(int[] citations) {
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			if (citations.length - i <= citations[i]) {
				return citations.length - i;
			}
		}
		return 0;
	}
}
