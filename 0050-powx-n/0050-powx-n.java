class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE; 
                x *= x;  
            } else {
                n = -n;
            }
        }
        
        double ans = 1.0;
        double temp = x;
        
        while (n > 0) {
            if (n % 2 != 0) {
                ans *= temp;
            }
            temp *= temp;
            n /= 2;
        }
        
        return ans;
        
    }
}