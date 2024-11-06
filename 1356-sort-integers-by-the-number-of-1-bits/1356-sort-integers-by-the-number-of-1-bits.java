class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int[] bits=new int[n];
        for(int i=0;i<n;i++){
            bits[i]=countbits(arr[i]);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(bits[j]>bits[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    temp=bits[j];
                    bits[j]=bits[j+1];
                    bits[j+1]=temp;
                }else if(bits[j]==bits[j+1]){
                    int a=arr[j];
                    int b=arr[j+1];
                    arr[j]=a<b?a:b;
                    arr[j+1]=a<b?b:a;
                }
            }
        }
        return arr;
    }
    
    public static int countbits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}