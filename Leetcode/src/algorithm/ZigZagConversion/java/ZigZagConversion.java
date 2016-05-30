package algorithm.ZigZagConversion.java;

import java.util.ArrayList;
import java.util.Vector;

public class ZigZagConversion {

	public String convert(String s, int numRows) {
		
		char[] ca = s.toCharArray();
		ArrayList<StringBuilder> result = new ArrayList<>();
		for(int i=0; i<numRows; i++){
			StringBuilder sb = new StringBuilder();
			result.add(sb);
		}
				
		for(int i=0; i<s.length();){
			for(int j=0; j<numRows && i<s.length(); i++,j++){
				result.get(j).append(ca[i]);
			}
			for(int j= numRows-2; i<s.length() && j>0;i++,j--){
				result.get(j).append(ca[i]);
			}
			
		}
		
		String res="";
		for(int i=0; i<numRows;i++){
			res+=result.get(i);
		}
		return res;
    }
}
