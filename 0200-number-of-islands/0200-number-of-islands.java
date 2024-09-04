class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    helper(grid,i,j,r,c);
                    count++;
                }
            }
        }
        return count;
    }
    public static void helper(char[][] arr,int i,int j,int r,int c){
        if(i==-1|| j==-1|| i==r||j==c||arr[i][j]=='0'|| arr[i][j]=='2'){
            return;
        }else{
            arr[i][j]='2';
            helper(arr,i-1,j,r,c);
            helper(arr,i,j-1,r,c);
            helper(arr,i+1,j,r,c);
            helper(arr,i,j+1,r,c);
        }
    }
}