class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> set=new ArrayList<>();
        for(int val: nums1){
            set.add(val);
        }
        for(int val: nums2){
            set.add(val);
        }
        Collections.sort(set);
        int k=set.size();
        int[] arr=new int[k];
        int index=0;
        for(int val: set){
            arr[index++]=val;
        }
        if(k%2!=0){
            return arr[(int)(k/2)];
        }
        int val1=arr[(int)k/2-1];
        int val2=arr[(int)k/2];
        return ((double) val1 + (double) val2) / 2.0;
    }
}