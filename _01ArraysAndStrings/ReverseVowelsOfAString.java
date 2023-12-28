package _01ArraysAndStrings;

/*
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', 
 * and they can appear in both lower and upper cases, more than once.
 * https://leetcode.com/problems/reverse-vowels-of-a-string
 * https://algo.monster/liteproblems/345
 */
public class ReverseVowelsOfAString {

    /*
     * Two pointers
     * O(n) time
     * O(n) space, String is immutable and we need to return a new String
     */
    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < s.length() && right >= 0) {
            if (left > right) {
                break;
            }
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            if (isVowel(arr[left]) && isVowel(arr[right])) {
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;
            }
            left++;
            right--;
        }

        return new String(arr);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));// holle
        System.out.println(reverseVowels("leetcode"));// leotcede
    }
}
