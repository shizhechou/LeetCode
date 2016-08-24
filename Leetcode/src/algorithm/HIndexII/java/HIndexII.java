package algorithm.HIndexII.java;

public class HIndexII {
	public int hIndex(int[] citations) {
		int l = 0;
		int r = citations.length-1;
		int n = citations.length;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (n - mid == citations[mid]) {
				return n - mid;
			} else if (n - mid < citations[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return n - (r + 1);
	}
}
