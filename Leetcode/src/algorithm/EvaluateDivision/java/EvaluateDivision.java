package algorithm.EvaluateDivision.java;

import java.util.HashMap;
import java.util.Map;

public class EvaluateDivision {
	// Union find algorithm
	public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		Map<String, Integer> elementIdTable = new HashMap<>();
		int len = 0;
		for (String[] words : equations) {
			for (String word : words) {
				if (!elementIdTable.containsKey(word)) {
					elementIdTable.put(word, len++);
				}
			}
		}

		Node[] nodes = new Node[len];
		for (int i = 0; i < len; i++) {
			nodes[i] = new Node(i);
		}

		for (int i = 0; i < equations.length; i++) {
			String keys[] = equations[i];
			int k1 = elementIdTable.get(keys[0]);
			int k2 = elementIdTable.get(keys[1]);
			int group1 = find(nodes, k1);
			int group2 = find(nodes, k2);
			nodes[group2].parent = group1;
			nodes[group2].value = nodes[k1].value * values[i] / nodes[k2].value;
		}

		double result[] = new double[queries.length];
		for (int i = 0; i < queries.length; i++) {
			Integer k1 = elementIdTable.get(queries[i][0]);
			Integer k2 = elementIdTable.get(queries[i][1]);
			if (k1 == null || k2 == null)
				result[i] = -1d;
			else {
				int group1 = find(nodes, k1);
				int group2 = find(nodes, k2);
				if (group1 != group2) {
					result[i] = -1d;
				} else {
					result[i] = nodes[k2].value / nodes[k1].value;
				}
			}
		}
		return result;
	}

	public int find(Node[] nodes, int k) {
		int p = k;
		while (nodes[p].parent != p) {
			p = nodes[p].parent;
			nodes[k].value *= nodes[p].value;
		}
		nodes[k].parent = p;
		return p;
	}

	private class Node {
		private int parent;
		private double value;

		public Node(int index) {
			this.parent = index;
			this.value = 1d;
		}
	}
}
