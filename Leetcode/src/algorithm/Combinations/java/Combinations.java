package algorithm.Combinations.java;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	// Like 216. Combination Sum III
	// https://leetcode.com/problems/combination-sum-iii/
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<>();
		dfs(result, tmp, 1, n, k);
		return result;
    }
	public void dfs(List<List<Integer>> res, List<Integer> tmp, int start, int n, int k){
		if (k == 0){
			res.add(new ArrayList<Integer>(tmp));
			return;
		}
		for(int i = start; i<=n; i++){
			tmp.add(i);
			dfs(res, tmp, i+1, n, k-1);
			tmp.remove(tmp.size()-1);
		}
	}
}
