class Solution {
    public boolean canSortArray(int[] nums) {
        int n=nums.length;
        boolean flag=true;
        int []bits=new int[n];
        if(isSorted(nums)){
                return true;
            }
        for(int i=0;i<n;i++){
            bits[i]=noofsetbits(nums[i]);
        }
        while(flag){

                flag=false;
                for(int i=0;i<n-1;i++){
                    for(int j=0;j<n-i-1;j++){
                        if(nums[j]>nums[j+1] &&(bits[j]==bits[j+1])){
                            int temp=nums[j];
                            nums[j]=nums[j+1];
                            nums[j+1]=temp;
                            flag=true;
                        }
                    }
                }
            if(isSorted(nums)){
                return true;
            }
        }
        return false;
        
    }
    public static boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int noofsetbits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}