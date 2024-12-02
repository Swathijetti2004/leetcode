/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray nums) {
        int start=0;
        int end=nums.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums.get(mid)<nums.get(mid+1)){
                start=mid+1; 
            }else{
                end=mid;
            }
        }
        int peak=end;
        int ans=binarySearchAsc(target,nums,0,peak);
        if(ans!=-1){
            return ans;
        }else{
            return binarySearchDsc(target,nums,peak+1,nums.length()-1);
        }
    }
    int binarySearchAsc(int target,MountainArray nums, int start,int end){
        int ans=-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(target==nums.get(mid)){
                return mid;
            }else if(target<nums.get(mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    int binarySearchDsc(int target,MountainArray nums, int start,int end){
      //  int ans=-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(target==nums.get(mid)){
                return mid;
            }else if(target>nums.get(mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}