class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i]) && Math.abs(i-m.get(nums[i]))<=k){
                return true;
            }
            m.put(nums[i],i);
        }
        // while(i<j){
        //     if(nums[i]==nums[j] && (Math.abs(i-j)<=k)){
        //         return true;
        //     }
        //     i++;
        //     j--;
        // }
        return false;
    }
}