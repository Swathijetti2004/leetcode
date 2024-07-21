class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int val: nums){
            set.add(val);
        }
        int index=0;
        for(int val: set){
            nums[index++]=val;
        }
        return set.size();
    }
}