class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int[] ans=new int[n];
        int maxXor=(1<<maximumBit)-1;
        int xor=nums[0];
        for(int i=1;i<n;i++){
            xor=xor^nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=xor^maxXor;
            xor=xor^nums[n-i-1];
        }
        return ans;
    }
}