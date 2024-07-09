class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer,Integer> m=new HashMap<>();
        
        for(Integer val:nums){
            m.put(val,m.getOrDefault(val,0)+1);
            if(m.get(val)>1){
                return true;
            }
        }
        return false;
        
    }
}