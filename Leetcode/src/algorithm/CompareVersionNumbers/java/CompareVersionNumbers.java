package algorithm.CompareVersionNumbers.java;

public class CompareVersionNumbers {

	public int compareVersion(String version1, String version2) {
        String[] v1Nums = version1.split("\\.");
        String[] v2Nums = version2.split("\\.");
        for(int i=0;i<v1Nums.length || i<v2Nums.length;i++){
        	int v1Num = (i<v1Nums.length) ? Integer.parseInt(v1Nums[i] ): 0;
        	int v2Num = (i<v2Nums.length) ? Integer.parseInt(v2Nums[i] ): 0;
        	if(v1Num < v2Num) return -1;
        	if(v2Num < v1Num) return 1;
        }
        return 0;
    }

}
