package algorithm.TopKFrequentElements.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		int n = nums.length;
		HashMap<Integer, Integer> h = new HashMap();
		for (int i : nums) {
			if (h.containsKey(i))
				h.put(i, h.get(i) + 1);
			else
				h.put(i, 1);
		}

		List<Integer>[] fc = new ArrayList[n + 1];
		for (int i : h.keySet()) {
			int f = h.get(i);
			if (fc[f] == null)
				fc[f] = new ArrayList();

			fc[f].add(i);
		}

		List<Integer> ans = new ArrayList();
		for (int i = n, j = 0; k > 0; k--) {
			for (; fc[i] == null || j == fc[i].size(); j = 0, i--)
				;
			ans.add(fc[i].get(j++));
		}

		return ans;
	}
}
