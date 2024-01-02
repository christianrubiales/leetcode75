package _04PrefixSum.easy;

/*
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index
 * is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 * https://leetcode.com/problems/find-pivot-index
 * https://algo.monster/liteproblems/724
 */
public class FindPivotIndex {
    /*
     * Build suffix first, subtracting at each iteration and adding to the prefix
     * O(n) time
     * O(1) space
     */
    public static int pivotIndex(int[] nums) {
        int prefix = 0;
        int suffix = 0;

        for (int num : nums) {
            suffix += num;
        }

        for (int i = 0; i < nums.length; i++) {
            suffix -= nums[i];
            if (suffix == prefix) {
                return i;
            }
            prefix += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));//3
        System.out.println(pivotIndex(new int[]{1,2,3}));//-1
        System.out.println(pivotIndex(new int[]{2,1,-1}));//0
    }
}
