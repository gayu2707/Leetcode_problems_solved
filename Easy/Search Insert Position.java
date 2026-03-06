class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int size = nums.length;
        for(i=0;i<size;i++)
        {
            if(nums[i]==target)
                return i;
        }
        int q=size-1;
        while(q>=0)
        {
            if(nums[q]<target)
                return q+1;
            else if(nums[0]>target)
                return 0;
            q--;
        }
        return -1;           
    }
}