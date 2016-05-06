package algorithm.PowerOfFour.java;

public class PowerOfFour {

	/*
	 * 1. There is only 'one' '1' in the first place which means 
	 * it will be 0 if num & num-1 Ex: num=4, 4&3 = 100(B)&011(B) = 0 
	 * 2. The '1' only appears on odd position. 
	 * 0x55555555 is mean all ... 1001(B) possibility in 32bit
	 */
	public boolean isPowerOfFour(int num) {
		return (num & num - 1) == 0 && (num & 0x55555555) > 0;
	}
}
