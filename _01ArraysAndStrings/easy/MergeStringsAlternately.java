package _01ArraysAndStrings.easy;

/*
 * You are given two strings word1 and word2. Merge the strings by adding letters 
 * in alternating order, starting with word1. If a string is longer than the other, 
 * append the additional letters onto the end of the merged string.
 * Return the merged string.
 * https://leetcode.com/problems/merge-strings-alternately
 * https://algo.monster/liteproblems/1768
 */
public class MergeStringsAlternately {

    /*
     * I'm using an array instead of StringBuilder used by others
     * O(n+m) time, n and m are lengths of the inputs
     * O(n+m) space, n and m are lengths of the inputs
     */
    public static String mergeAlternately(String word1, String word2) {
        char[] arr = new char[word1.length() + word2.length()];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < word1.length() && j < word2.length()) {
            arr[k++] = word1.charAt(i++);
            arr[k++] = word2.charAt(j++);
        }

        while (i < word1.length()) {
            arr[k++] = word1.charAt(i++);
        }

        while (j < word2.length()) {
            arr[k++] = word2.charAt(j++);
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));// apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));// apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));// apbqcd
    }
}