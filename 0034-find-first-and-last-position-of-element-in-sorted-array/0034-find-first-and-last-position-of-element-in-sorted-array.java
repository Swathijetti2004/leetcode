class Solution {
    public int[] searchRange(int[] arr, int x) {
        
        int start=0;
        int end=arr.length-1;
        int first=-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(x==arr[mid]){
                first=mid;
                end=mid-1;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        start=0;
        end=arr.length-1;
                while(start<=end){
            int mid=(start+end)/2;
            if(x==arr[mid]){
                last=mid;
                start=mid+1;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
//          // Your code goes here
//            int l=0;
//            int r=v.length-1;
//            int first=-1;
//            int last=-1;
           
//            //first occurance
//            while(l<=r){
//                int mid=(l+r)/2;
//                if(v[mid]==x){
//                    first=mid;
//                    r=mid-1;
//                }else if(v[mid]>x){
//                    r=mid-1;
//                }else{
//                    l=mid+1;
//                }
//            }
           
//            l=0;
//            r=v.length-1;
//            //last occurance
//            while(l<=r){
//                int mid=(l+r)/2;
//                if(v[mid]==x){
//                    last=mid;
//                    l=mid+1;
//                }else if(v[mid]>x){
//                    r=mid-1;
//                }else{
//                    l=mid+1;
//                }
//            }
        int ans[]={first,last};
        return ans;
    }
}