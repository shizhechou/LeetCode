package algorithm.SortColors.java;

public class SortColors {
	public void sortColors(int[] nums) {
		int len = nums.length;
		int color0 = 0;
		int color1 = 0;
		int color2 = 0;

		for (int i = 0; i < len; i++) {
			if (nums[i] == 0)
				color0++;
			else if (nums[i] == 1)
				color1++;
			else if (nums[i] == 2)
				color2++;
		}
		for (int i = 0; i < color0; i++)
			nums[i] = 0;
		for (int i = 0; i < color1; i++)
			nums[color0 + i] = 1;
		for (int i = 0; i < color2; i++)
			nums[color0 + color1 + i] = 2;
	}
}
