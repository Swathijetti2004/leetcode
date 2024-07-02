class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) 
          return false;
      else{
          double f=Math.log(n)/Math.log(4);
          if(Math.pow(4,Math.round(f))==n){
              return true;
          }
          else{
              return false;
          }
      }
    }
}