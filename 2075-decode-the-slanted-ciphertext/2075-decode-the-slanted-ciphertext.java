class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=encodedText.length();
        int index=0;
        int cols=(int)(Math.ceil(n/rows));
        char[][] arr=new char[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=encodedText.charAt(index++);
            }
        }
        StringBuffer ans=new StringBuffer();
        int p=0;
        int q=0;
        for(int j=0;j<cols;j++){
            int i=0;
            int k=j;
            while(i<rows && k<cols){
                ans.append(arr[i][k]);
                if(i==rows-1 && k==cols-1){
                    break;
                }
                i++;
                k++;
                
            }
            
        }
        // while(q<cols){
        //     for(int k=0;k<rows;k++){
        //         for(int l=q;l<q+rows;l++){
        //             ans.append(arr[k][l]);
        //         }
        //     }
        //     q++;
        // }
        return ans.toString().stripTrailing();
        
    }
}