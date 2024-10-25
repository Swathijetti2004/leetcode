class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        if(arr.length!=(m*n)){
            int[][] temp={};
            return temp;
        }
        int[][] ans=new int[m][n];
        int i=0,j=0;
        for(int ind=0;ind<arr.length;ind++){
            ans[i][j++]=arr[ind];
            if(j==n){
                i=i+1;
                j=0;
            }
        }
        return ans;
    }
}