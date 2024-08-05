class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int[] a=new int[2];
        for (int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                a[0]=map.get(rem);
                a[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return a;
    }
}