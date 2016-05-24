package algorithm.LongestCommonPrefix.java;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if(strs.length < 1 || strs == null){
			return "";
		}
		if(strs.length == 1){
			return strs[0];
		}
		
		int len = strs[0].length();
		int shortest = 0;
		for(int i=1; i<strs.length; i++){
			if(strs[i].length() < len){
				len = strs[i].length();
				shortest = i;
			}
		}
		String sub = strs[shortest];
		for(int i=0; i<strs.length;i++){
			while(strs[i].indexOf(sub) != 0){
				sub = sub.substring(0, sub.length()-1);
			}
		}
		return sub;
    }
}
