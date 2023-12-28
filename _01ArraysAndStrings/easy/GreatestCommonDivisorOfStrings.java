package _01ArraysAndStrings.easy;

/*
 * For two strings s and t, we say "t divides s" if and only if 
 * s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2,
 * return the largest string x such that x divides both str1 and str2.
 * https://leetcode.com/problems/greatest-common-divisor-of-strings
 * https://algo.monster/liteproblems/1071
 */
public class GreatestCommonDivisorOfStrings {
    
    /*
     * The two strings will have a gcd if str1+str2 == str2+str1
     * The gcds of the lengths will be used to get the substring as the gcd
     * Sadly you need to use the techniques from the internet
     * and not follow your own since your own method is error-prone
     * O(n+m) time
     * O(n+m) space
     */
    public static String gcdOfStrings(String str1, String str2) {
        // no common divisor
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0, gcd);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));// ABC
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));// AB
        System.out.println(gcdOfStrings("LEET", "CODE"));// ""
    }
}
