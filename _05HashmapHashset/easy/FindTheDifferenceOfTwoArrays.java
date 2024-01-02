package _05HashmapHashset.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 * https://leetcode.com/problems/find-the-difference-of-two-arrays
 * https://algo.monster/liteproblems/2215
 */
public class FindTheDifferenceOfTwoArrays {
    /*
     * Straightforward with Sets
     * O(n) time
     * O(n) space
     */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> differences = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        List<Integer> toRemove = new ArrayList<>();
        for (int num : nums2) {
            if (!set1.contains(num)) {
                set2.add(num);
            } else {
                toRemove.add(num);
            }
        }

        set1.removeAll(toRemove);
        differences.add(new ArrayList<>(set1));
        differences.add(new ArrayList<>(set2));

        return differences;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));// [[1,3],[4,6]]
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));// [[3],[]]
    }
}
