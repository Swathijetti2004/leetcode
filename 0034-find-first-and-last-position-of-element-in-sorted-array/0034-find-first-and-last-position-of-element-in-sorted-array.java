class Solution {
    public int[] searchRange(int[] v, int x) {
         // Your code goes here
           int l=0;
           int r=v.length-1;
           int first=-1;
           int last=-1;
           
           //first occurance
           while(l<=r){
               int mid=(l+r)/2;
               if(v[mid]==x){
                   first=mid;
                   r=mid-1;
               }else if(v[mid]>x){
                   r=mid-1;
               }else{
                   l=mid+1;
               }
           }
           
           l=0;
           r=v.length-1;
           //last occurance
           while(l<=r){
               int mid=(l+r)/2;
               if(v[mid]==x){
                   last=mid;
                   l=mid+1;
               }else if(v[mid]>x){
                   r=mid-1;
               }else{
                   l=mid+1;
               }
           }
        int arr[]={first,last};
        return arr;
    }
}