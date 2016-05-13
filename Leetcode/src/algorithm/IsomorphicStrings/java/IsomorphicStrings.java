package algorithm.IsomorphicStrings.java;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;

		Map<Character, Integer> mapS = new HashMap<Character, Integer>();
		Map<Character, Integer> mapT = new HashMap<Character, Integer>();
		// Use HashMap.put will return previous value to record previous value is equal or not.
		for (Integer i = 0; i < s.length(); i++) {
			if (mapS.put(s.charAt(i), i) != mapT.put(t.charAt(i), i)) {
				return false;
			}
		}
		return true;
	}
}
