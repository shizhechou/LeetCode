package algorithm.ValidAnagram.java;

import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s = scanner.next();
		System.out.println("Enter second string:");
		String t = scanner.next();
		Boolean result = isAnagram(s, t);
		System.out.println("Is two string equal?" + result);
	}

	public static boolean isAnagram(String s, String t) {
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		Arrays.sort(schar);
		Arrays.sort(tchar);

		String s1 = new String(schar);
		String s2 = new String(tchar);
		if (s1.equals(s2))
			return true;
		else
			return false;
	}
}
