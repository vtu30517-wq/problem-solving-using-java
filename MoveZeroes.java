public class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // pointer for the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if i != lastNonZeroFoundAt to minimize operations
                if (i != lastNonZeroFoundAt) {
                    int temp = nums[i];
                    nums[i] = nums[lastNonZeroFoundAt];
                    nums[lastNonZeroFoundAt] = temp;
                }
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 1 3 12 0 0

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 0
    }
}
