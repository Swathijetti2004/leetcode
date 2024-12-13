class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        long score = 0;
        boolean[] marked = new boolean[n];

        // Create an array of indices sorted by the values in nums (and by index for ties)
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> nums[a] == nums[b] ? a - b : nums[a] - nums[b]);

        // Process each element in sorted order
        for (int index : indices) {
            if (marked[index]) continue; // Skip if already marked

            // Add the value to the score
            score += nums[index];

            // Mark the current element and its adjacent elements
            marked[index] = true;
            if (index > 0) marked[index - 1] = true;
            if (index < n - 1) marked[index + 1] = true;
        }

        return score;
    //     long score=0;
    //     boolean flag=true;
    //     if(nums.length==1){
    //         score+=nums[0];
    //         return score;
    //     }
    //     while(flag==true){
    //         int min=-1;
    //         boolean check=false;
    //         for(int i=0;i<nums.length;i++){
    //             if(nums[i]!=-1 && (min==-1 || nums[i]<nums[min])){
    //                 min=i;
    //                 check=true;
    //             }
    //         }
    //         if(check==true){
    //             score+=nums[min];
    //             nums[min]=-1;
    //             if(min>0){
    //                 nums[min-1]=-1;
    //             }
    //             if(min<nums.length-1){
    //                 nums[min+1]=-1;
    //             }
    //         }else{
    //            break;
    //         }
    //     }
    // return score;

    }
}