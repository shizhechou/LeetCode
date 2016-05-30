package algorithm.ValidPalindrome.java;

public class ValidPalindrome {

	@SuppressWarnings("null")
	public boolean isPalindrome(String s) {

		if(s.isEmpty())
			return true;
		
		StringBuilder tmp = new StringBuilder();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				tmp.append(s.charAt(i));
			}
		}

		for (int j = tmp.length() - 1, i = 0; j >= 0 && i < tmp.length(); j--, i++) {
			if (tmp.charAt(i) != tmp.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
}
