package algorithm.ExcelSheetColumnNumber.java;

import java.util.Scanner;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter excel title:");
	    String s = scanner.next();
	    int result = titleToNumber(s);
	    System.out.println("Result digital is:" + result);

	}
	
	public static int titleToNumber(String s) {
	    int num = 0;
	    char[] title = s.toCharArray();
	    for (char c : title){
	      num = num * 26 + (c - 'A' + 1);
	    }
	    return num;
	  }

}
