class Solution {
    public int countSquares(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        int min=r<=c?r:c;
        int count=0;
        for(int size=1;size<=min;size++){
            for (int i=0;i<=r-size;i++){
                for (int j=0;j<=c-size;j++){
                    if(isSquare(m,i,j,size,r,c)){
                        count+=1;
                    }
                }
            }
            System.out.println(count+" "+size);
        }
        return count;
    }
    
    public static boolean isSquare(int[][] mat,int m,int n,int size,int r,int c){
        for(int i=m;i<m+size;i++){
            for(int j=n;j<n+size;j++){
                if((i<r && j<c )&& (mat[i][j]==0)){
                    return false;
                }
            }
        }
        return true;
    }
}