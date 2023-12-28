package _02TwoPointers.easy;

import java.util.Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * Follow up: Could you minimize the total number of operations done?
 * https://leetcode.com/problems/move-zeroes
 */
public class MoveZeroes {

    /*
     * NOTE: Not two pointers
     * NOTE: Can't follow your own ideas here as your own is problematic
     * Just one pointer for the non-zero index
     * Iterate the array until you reach a non-zero
     * Copy that value to the nonZeroIndex
     * Increment nonZeroIndex
     * From the last nonZeroIndex up to the last index, set the values to zero
     * O(n) time
     * O(1) space
     */
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        int length = nums.length;
        
        for (int i = 0; i < length; i++) {
            // non-zero found
            if (nums[i] != 0) {
                // copy that value to the nonZeroIndex
                nums[nonZeroIndex] = nums[i];
                // increment nonZeroIndex
                nonZeroIndex++;
            }
        }

        // From the last nonZeroIndex up to the last index, set the values to zero
        for (int i = nonZeroIndex; i < length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));// [1,3,12,0,0]
        arr = new int[]{0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));// [0]
        arr = new int[]{1,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));// [1,0]
    }
}
