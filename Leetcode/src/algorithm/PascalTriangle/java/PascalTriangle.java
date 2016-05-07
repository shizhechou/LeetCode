package algorithm.PascalTriangle.java;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0)
			return result;

		List<Integer> sub = new ArrayList<Integer>();
		sub.add(1);
		result.add(sub);

		for (int i = 1; i < numRows; i++) {
			List<Integer> r = new ArrayList<Integer>();
			r.add(1);
			List<Integer> p = result.get(i - 1);
			for (int j = 0; j < p.size() - 1; j++) {
				r.add(p.get(j) + p.get(j + 1));
			}
			r.add(1);
			result.add(r);
		}
		return result;
	}
}
