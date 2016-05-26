package algorithm.AddBinary.java;

public class AddBinary {

	public String addBinary(String a, String b) {
		StringBuilder sum = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0 || carry != 0) {
			int digitA = i < 0 ? 0 : a.charAt(i) - '0';
			int digitB = j < 0 ? 0 : b.charAt(j) - '0';
			sum.insert(0, (digitA + digitB + carry) % 2);
			carry = (digitA + digitB + carry) / 2;
			i--;
			j--;
		}
		return sum.toString();
	}
	// public static String addBinary(String a, String b) {
	// if(a.length() == 0 || a == null)
	// a = "0";
	// if(b.length() == 0 || b == null)
	// b = "0";
	// // number format exception when string a is very long > 128
	// long numA = Long.parseLong(a, 2);
	// long numB = Long.parseLong(b, 2);
	// System.out.println(intToBinaryString(numA+numB));
	// return intToBinaryString(numA+numB);
	// }
	//
	// public static String intToBinaryString(long num){
	// String result = "";
	// while (num > 0){
	// result = (num % 2 != 0 ? "1" : "0") + result;
	// num /= 2;
	// }
	// if(result.isEmpty())
	// return "0";
	// else
	// return result;
	// }
}
