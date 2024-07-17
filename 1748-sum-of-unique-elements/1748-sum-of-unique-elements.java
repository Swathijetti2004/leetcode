class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer m:map.keySet()){
            if(map.get(m)==1){
                sum+=(int)(m);
            }
        }
        //Iterator i=map.keySet().iterator();
        // while(i.hasNext()){
        //     int n=(int)(i.next());
        //     if(map.get(n)==1){
        //         sum+=n;
        //     }
        // }
        return sum;
    }
}