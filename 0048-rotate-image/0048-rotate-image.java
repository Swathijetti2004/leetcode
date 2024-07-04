class Solution {
    public void rotate(int[][] matrix) {
        // Code Here
        int n=matrix.length;
        
        // transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        //rotate 90 degrees
        int l=0;
        int r=n-1;
        while(l<r){
            for(int i=0;i<n;i++){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
            }
            l++;
            r--;
        }
    }
}