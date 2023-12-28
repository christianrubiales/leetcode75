package _02TwoPointers.easy;

/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string 
 * by deleting some (can be none) of the characters without disturbing 
 * the relative positions of the remaining characters. 
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * https://leetcode.com/problems/is-subsequence
 * https://algo.monster/liteproblems/392
 */
public class IsSubsequence {

    /*
     * NOTE: Just follow the algorithm from the internet
     * Initialise indexes and lengths
     * While indexes are not out of bounds
     * If we have a match, move to the next letter to check
     * Move to the next letter in t in any case
     * True if all letters matched
     * O(n) time
     * O(1) space
     */
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        int sLength = s.length();
        int tLength = t.length();
        
        while (sIndex < sLength && tIndex < tLength) {
            // we have a match, move to the next letter to check
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            // move to the next letter in t in any case
            tIndex++;
        }

        // all letters in s matched
        return sIndex == sLength;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));// true
        System.out.println(isSubsequence("axc", "ahbgdc"));// false
        System.out.println(isSubsequence("ace", "abcde"));// true
        System.out.println(isSubsequence("aec", "abcde"));// false
        System.out.println(isSubsequence("abc", ""));// false
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));// false
    }
}
