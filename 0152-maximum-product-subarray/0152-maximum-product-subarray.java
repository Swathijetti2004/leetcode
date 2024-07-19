class Solution {
    public int maxProduct(int[] nums) {
        double left=1;
        double right=1;
        double ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(left==0){
                left=1;
            }
            if(right==0){
                right=1;
            }
            left=left*nums[i];
            right=right*nums[nums.length-i-1];
            ans=Math.max(ans,Math.max(left,right));
        }
        return (int)ans;
    }
}