public class Solution {

    public static int removeDuplicates(int[] nums) {
        
        // If array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Pointer for unique elements
        int k = 1;  // First element is always unique

        // Start from second element
        for (int i = 1; i < nums.length; i++) {
            
            // If current element is different from previous
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        
        int k = removeDuplicates(nums);
        
        System.out.println("Unique count: " + k);
        
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
