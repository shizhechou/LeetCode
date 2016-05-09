package algorithm.PlusOne.java;

public class PlusOne {

	public int[] plusOne(int[] digits) {
        if(digits.length == 0)
            return digits;
        
        for(int i = digits.length-1; i >= 0 ; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }else if(i == 0){
                int result[] = new int[digits.length+1];
                result[0] = 1;
                return result;
            }else{
                digits[i] = 0;
            }
        }
        return digits;
    }
}
