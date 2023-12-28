package _01ArraysAndStrings.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * There are n kids with candies. You are given an integer array candies, 
 * where each candies[i] represents the number of candies the ith kid has, 
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * 
 * Return a boolean array result of length n, where result[i] is true if, 
 * after giving the ith kid all the extraCandies, 
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * 
 * Note that multiple kids can have the greatest number of candies.
 * 
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 * https://algo.monster/liteproblems/1431
 */
public class KidsWithTheGreatestNumberOfCandies {

    /*
     * Straightforward.
     * Iterate twice, first to get the max, then to check against max.
     * O(n) time, even if iterating twice
     * O(n) space if considering the result to return
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));// [true,true,true,false,true]
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));// [true,false,false,false,false]
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));// [true,false,true]
    }
}
