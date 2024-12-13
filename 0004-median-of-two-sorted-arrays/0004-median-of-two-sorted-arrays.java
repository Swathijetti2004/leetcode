class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=nums1.length-1;
        int j=0;
        while(i>=0 && j<n2 && nums1[i]>=nums2[j]){
            int temp=nums1[i];
            nums1[i]=nums2[j];
            nums2[j]=temp;
            i--;
            j++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int totalLength = n1 + n2;
        int mid = totalLength / 2;

        if (totalLength % 2 == 0) {
            return (getKthElement(nums1, nums2, mid - 1) + getKthElement(nums1, nums2, mid)) / 2.0;
        } else {
            return getKthElement(nums1, nums2, mid);
        }
        // List<Integer> set=new ArrayList<>();
        // for(int val: nums1){
        //     set.add(val);
        // }
        // for(int val: nums2){
        //     set.add(val);
        // }
        // Collections.sort(set);
        // int k=set.size();
        // int[] arr=new int[k];
        // int index=0;
        // for(int val: set){
        //     arr[index++]=val;
        // }
        // if(k%2!=0){
        //     return arr[(int)(k/2)];
        // }
        // int val1=arr[(int)k/2-1];
        // int val2=arr[(int)k/2];
        // return ((double) val1 + (double) val2) / 2.0;
    }
     private int getKthElement(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (k < n1) return nums1[k];
        else return nums2[k - n1];
    }
}