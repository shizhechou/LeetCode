package algorithm.CombinationSumIII.java;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> element = new ArrayList<>();
		dfs(result, element, k, n, 1);
		return result;
	}

	public static void dfs(List<List<Integer>> res, List<Integer> element, int step, int sum, int start) {
		if (step == 0) {
			if (sum == 0) {
				res.add(new ArrayList<>(element));
			}
			return;
		}

		for (int i = start; i <= sum / step && i < 10; i++) {
			element.add(i);

			dfs(res, element, step - 1, sum - i, i + 1);
			element.remove(element.size() - 1);
		}

	}
	
					
	public static void main(String arg[]) {

		combinationSum3(3, 7);
	}
}
