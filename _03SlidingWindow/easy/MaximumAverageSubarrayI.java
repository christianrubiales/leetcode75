package _03SlidingWindow.easy;

/*
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 * https://leetcode.com/problems/maximum-average-subarray-i
 * https://algo.monster/liteproblems/643
 */
public class MaximumAverageSubarrayI {

    /*
     * Frustrating indexing, follow whatever is on the internet
     * 1. Build Initial Sum and MaxSum
     * 2. Slide
     * 3. Make sure to cast to double before dividing
     * 4. Only perform division at end
     * O(n) time (1 pass)
     * O(1) space
     */
    public static double findMaxAverage(int[] nums, int k) {
        // build initial sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        // slide
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum * 1.0d / k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4)); // 12.75000
        System.out.println(findMaxAverage(new int[]{5}, 1)); // 12.75000
    }
}
