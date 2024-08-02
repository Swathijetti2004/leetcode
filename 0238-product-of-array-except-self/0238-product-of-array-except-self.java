class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }else{
                zero++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zero>1){
                nums[i]=0;
            }else if(zero==1 && nums[i]!=0){
                nums[i]=0;
            }else if(zero==1 && nums[i]==0){
                nums[i]=prod;
            }else{
                nums[i]=(int)(prod/nums[i]);
            }
        }
        return nums;
    }
}