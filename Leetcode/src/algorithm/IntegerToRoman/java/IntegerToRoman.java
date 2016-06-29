package algorithm.IntegerToRoman.java;

public class IntegerToRoman {
	// Reference : http://www.blackwasp.co.uk/NumberToRoman.aspx
	// 1. the letters can be repeated several times
	// 2. the larger numerals must be placed to the left of the smaller numerals
	// to continue the additive combination. So VI equals six and MDCLXI is
	// 1,661.
	// 3. allows for a small-value numeral to be placed to the left of a larger
	// value. Where this occurs, for example IX, the smaller numeral is
	// subtracted from the larger.
	// 4. The subtracted digit must be at least one tenth of the value of the
	// larger numeral. Accordingly, ninety-nine is not IC but rather XCIX.
	public String intToRoman(int num) {
		// for rule 4
		int[] values = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] numerals = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num -= values[i];
				result.append(numerals[i]);
			}
		}
		return result.toString();

	}
}
