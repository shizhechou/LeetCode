package algorithm.CountNumbersWithUniqueDigits.java;

public class CountNumbersWithUniqueDigits {
	public int countNumbersWithUniqueDigits(int n) {
		if (n == 0)
			return 1;
		int res = 10; // n = 1, 0~9 has 10 numbers
		int unique_dig = 9;
		int avail_dig = 9;
		while (n-- > 1 && avail_dig > 0) {
			unique_dig = unique_dig * avail_dig;
			res += unique_dig;
			avail_dig--;
		}
		return res;
	}
}
