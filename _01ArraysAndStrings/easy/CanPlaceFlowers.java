package _01ArraysAndStrings;

/*
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, 
 * where 0 means empty and 1 means not empty, and an integer n, 
 * return true if n new flowers can be planted in the flowerbed 
 * without violating the no-adjacent-flowers rule and false otherwise.
 * https://leetcode.com/problems/can-place-flowers
 * https://algo.monster/liteproblems/605
 */
public class CanPlaceFlowers {
    
    /*
     * Lots of indexing so can be error-prone
     * O(n) time
     * O(1) space
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int length = flowerbed.length;

        while (i < length && n > 0) {
            if (flowerbed[i] == 0) {
                if ((i == 0 && i+1 < length && flowerbed[i+1] == 0)  
                    || (i == length - 1 && i-1 >= 0 && flowerbed[i-1] == 0) 
                    || (length == 1)
                    || (i > 0 && i < length - 2 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0)) {
                        flowerbed[i] = 1;
                        n--;
                }
            }
            i++;
        }

        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));// true
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));// false
        System.out.println(canPlaceFlowers(new int[]{0}, 1));// true
        System.out.println(canPlaceFlowers(new int[]{0,1,0}, 1));// false
    }
}
