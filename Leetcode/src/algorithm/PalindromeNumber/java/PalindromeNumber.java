package algorithm.PalindromeNumber.java;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        if(x<0) return false;
        int tmp = x;
        int y = 0;
        
        while(x != 0){
            y = y*10 + x%10;
            x = x/10;
        }
        
        if(y == tmp){
            return true;
        }else{
            return false;
        }
        
    }
}
