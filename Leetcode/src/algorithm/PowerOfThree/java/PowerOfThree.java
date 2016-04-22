package algorithm.PowerOfThree.java;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the positive number:");
		int num = scanner.nextInt();
		boolean result = isPowerOfThree(num);
		System.out.println("The number "+num+(result?" is":" isn't")+" power of three.");
	}
	
	public static boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int 
        return n>0 && 1162261467%n==0;
    }
	
}
