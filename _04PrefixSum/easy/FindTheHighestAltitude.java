package _04PrefixSum.easy;

/*
 * There is a biker going on a road trip.
 * The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n
 * where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 */
public class FindTheHighestAltitude {

    /*
     * Almost straightforward
     * Initialize max and altitude to 0
     */
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;

        for (int g : gain) {
            altitude += g;
            max = Math.max(max, altitude);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7})); // 1
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2})); // 0
    }
}
