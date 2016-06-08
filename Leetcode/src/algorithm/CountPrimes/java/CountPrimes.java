package algorithm.CountPrimes.java;

public class CountPrimes {
	public int countPrimes(int n) {
        if(n <=1 ) return 0;
        
        boolean[] noPrime = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++){
            if(noPrime[i] == false){
                
                for(int j=2;i*j<n;j++){
                    noPrime[i*j]=true;
                }
            }
        }
        
        for(int i=2;i<n;i++){
            if(noPrime[i]==false){
                count++;
            }
        }
        return count;
    }
}
