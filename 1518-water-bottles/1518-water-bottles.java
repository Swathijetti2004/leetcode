class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty=numBottles;
        while(empty>= numExchange){
            int r=empty%numExchange;
            ans+=(int)empty/numExchange;
            empty=r+(int)empty/numExchange;
        }
        return ans;
    }
}