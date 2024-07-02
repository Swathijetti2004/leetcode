class Solution {
    public boolean isPowerOfThree(int n) {
      if(n<=0) 
          return false;
      else{
          double f=Math.log(n)/Math.log(3);
          if(Math.pow(3,Math.round(f))==n){
              return true;
          }
          else{
              return false;
          }
      }
    }
}