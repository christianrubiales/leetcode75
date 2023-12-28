package _01ArraysAndStrings;

/*
 * For two strings s and t, we say "t divides s" if and only if 
 * s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2,
 * return the largest string x such that x divides both str1 and str2.
 */
public class GreatestCommonDivisorOfStringsMine {
    
    public static String gcdOfStrings(String str1, String str2) {
        String pre = "";
        int i = 0;

        while (i < str1.length() && i < str2.length()) {
            String temp = str1.substring(0, i+1);
            if (divides(str1, temp) && divides(str2, temp)) {
                pre = temp;
            }
            i++;
        };

        return pre;
    }

    public static boolean divides(String str, String pre) {
        if (pre.isEmpty()) {
            return true;
        }

        // if not a multiple in size, return false
        if (str.length() < pre.length() || str.length() % pre.length() != 0) {
            return false;
        }

        int m = str.length() / pre.length();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < m; i++) {
            temp.append(pre);
        }

        return temp.toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));// ABC
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));// AB
        System.out.println(gcdOfStrings("LEET", "CODE"));// ""
    }
}
