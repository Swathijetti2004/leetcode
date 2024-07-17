class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int index=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[index++]=nums[i];
            }
        }
        while(index<nums.length){
            ans[index++]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}