class Solution {
    public void sortColors(int[] a) {
        int zeros=0;
        int ones=0;
        int twos=0;
        int n=a.length;
        for(int j=0;j<n;j++){
            if(a[j]==0){
                zeros++;
            }else if(a[j]==1){
                ones++;
            }else{
                twos++;
            }
        }
        int i=0;
        while(zeros!=0){
            a[i++]=0;
            zeros--;
        }
        while(ones!=0){
            a[i++]=1;
            ones--;
        }
         while(twos!=0){
            a[i++]=2;
            twos--;
        }
    }
}