class Solution {
    public int findClosestNumber(int[] nums) {
        int num=1000000;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(num)){
                num=nums[i];               
            }else if(Math.abs(nums[i])==Math.abs(num)){
                num=Math.max(num,nums[i]);               
            }
        }
        return num;                             
    }
}