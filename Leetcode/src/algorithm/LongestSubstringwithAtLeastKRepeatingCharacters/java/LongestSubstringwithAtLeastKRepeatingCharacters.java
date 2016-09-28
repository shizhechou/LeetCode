package algorithm.LongestSubstringwithAtLeastKRepeatingCharacters.java;

public class LongestSubstringwithAtLeastKRepeatingCharacters {
	public int longestSubstring(String s, int k) {
		char str[] = s.toCharArray();
		return divide_conquer_helper(str, 0, s.length(), k);
	}

	public int divide_conquer_helper(char str[], int start, int end, int k) {
		if (end < start) {
			return 0;
		}
		if (end - start < k)
			return 0;
		int alphabet[] = new int[26];
		for (int i = start; i < end; i++) {
			int id = str[i] - 'a';
			alphabet[id]++;
		}
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] == 0)
				continue;
			if (alphabet[i] < k) {
				for (int j = start; j < end; j++) {
					if (str[j] == i + 'a') {
						int left = divide_conquer_helper(str, start, j, k);
						int right = divide_conquer_helper(str, j + 1, end, k);
						return Math.max(left, right);
					}
				}
			}
		}
		return end - start;
	}
}
