package algorithm.SingleNumberIII.java;

public class SingleNumberIII {

	public int[] singleNumber(int[] nums) {
		int tmp = 0;
		int res[] = new int[2];
		// 1. Leetcode 136, use XOR to find the number that not double
		for(int num : nums) {
			tmp ^= num;
		}
		// 2. Because we need to find out two different number
		// it most has one bit is different, use rightmost different bit
		// to divide the numbers
		tmp &= -tmp;
		// 3. divide numbers by rightmost 1 bit
		for(int num : nums){
			if((num&tmp)>0){
				res[0]^=num;
			}else{
				res[1]^=num;
			}
		}
		return res;
    }
}
