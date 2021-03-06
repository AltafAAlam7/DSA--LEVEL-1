class Solution {
    public boolean isPowerOfFour(int n) {
      if(isPowerOfTwo(n)==false)
          return false;
        
        int count = 0;
        while(n!=1){
            count++;
            n>>>=1;
        }
        return (count & 1) == 0;
      
      
    }
    public boolean isPowerOfTwo(int n) {
      return n>0 && (n&(n-1))==0; 
    }
  }