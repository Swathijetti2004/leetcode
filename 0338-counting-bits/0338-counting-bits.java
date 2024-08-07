class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            int k=i;
            int count=0;
            while(k>0){
                count=count+1;
                k=k&(k-1);
            }
            ans[i]=count;
        }
        return ans;
    }
}