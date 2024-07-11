class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.pow(n,0.5);
        // if(n<0){
        //     return -1;
        // }else if(n<=1){
        //     return n;
        // }
        // boolean[] arr=new boolean[n+1];
        // Arrays.fill(arr,true);
        // arr[0]=false;
        // for(int i=2;i<=n;i++ ){
        //     arr[i]=false;
        // }
        // for(int i=3;i<=n;i++){
        //     for(int j=i;j<=n;j=j+i){
        //         arr[j]=!arr[j];
        //     }
        // }
        // int count=0;
        // for(int i=0;i<=n;i++){
        //     if(arr[i]){
        //         count++;
        //     }
        // }
        // return count;
    }
}