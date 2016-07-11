package algorithm.GrayCode.java;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList<Integer>();
		int total = (int) Math.pow(2, n);
		for (int i = 0; i < total; i++) {
			// https://en.wikipedia.org/wiki/Gray_code
			int tmp = (i / 2) ^ i;
			res.add(tmp);
		}
		return res;
	}
}
