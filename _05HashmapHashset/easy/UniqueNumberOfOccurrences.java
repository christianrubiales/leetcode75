package _05HashmapHashset.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique
 * or false otherwise.
 * https://leetcode.com/problems/unique-number-of-occurrences
 * https://algo.monster/liteproblems/1207
 */
public class UniqueNumberOfOccurrences {

    /*
     * Build the counts
     * Check if the counts are unique
     * The number of items should be the same as the number of counts
     * O(n) time
     * O(n) space
     */
    public static boolean uniqueOccurrences(int[] arr) {
        // build counter
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : arr) {
            Integer count = counter.getOrDefault(num, 0);
            count = count + 1;
            counter.put(num, count);
        }

        Set<Integer> counts = new HashSet<>(counter.values());

        return counter.size() == counts.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));//true
        System.out.println(uniqueOccurrences(new int[]{1,2}));//false
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));//true
    }
}
