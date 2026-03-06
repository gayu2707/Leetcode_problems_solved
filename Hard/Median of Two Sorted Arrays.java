class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merged=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m) 
        {
            if(nums1[i]<nums2[j])
            {
                merged[k++]=nums1[i++];
            } 
            else
            {
                merged[k++]=nums2[j++];
            }
        }
        while(i<n) 
        {
            merged[k++]=nums1[i++];
        }
        while(j<m) 
        {
            merged[k++]=nums2[j++];
        }
        int size= merged.length;
        double median;
        if (size% 2 == 1) 
        {
            median=merged[size/ 2];
            return median;
        } 
        else 
        {
            int mid1=merged[size/2-1];
            int mid2=merged[size/2];
            median=(mid1+mid2)/2.0;
            return median;
        }
    }
}
