class Solution {
    public char nextGreatestLetter(char[] nums, char target) {
        int start=0;
        int end=nums.length-1;
        if(nums[end]<=target){
            return nums[0];
        }
        while(start<=end){
            int mid=(end+start)/2;
            // if(nums[mid]==target && (mid+1)!=nums.length){
            //     return nums[mid+1];
            // }
           if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(start!=nums.length){
            return nums[start];
        }
        return nums[0];   
    }
}