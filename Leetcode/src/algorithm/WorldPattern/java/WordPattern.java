package algorithm.WorldPattern.java;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		Map<Character, String> map = new HashMap<>();
		String words[] = str.split(" ");

		if (pattern.length() != words.length) {
			return false;
		} else {
			for (int i = 0; i < pattern.length(); i++) {
				if (map.containsKey(pattern.charAt(i))) {
					if (!map.get(pattern.charAt(i)).equals(words[i])) {
						return false;
					}
				} else {
					if (map.containsValue(words[i])) {
						return false;
					} else {
						map.put(pattern.charAt(i), words[i]);
					}
				}
			}
		}
		return true;
	}
}
