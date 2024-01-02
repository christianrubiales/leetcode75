package _07Queue.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * https://leetcode.com/problems/number-of-recent-calls
 * https://algo.monster/liteproblems/933
 */
public class NumberOfRecentCalls {

    /*
     * O(n) time for ping()
     * O(n) space wrt the number of ping() calls
     */
    static class RecentCounter {
        Deque<Integer> queue;

        public RecentCounter() {
            this.queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.addLast(t);
            int lower = t - 3000;
            while (queue.getFirst() < lower) {
                queue.removeFirst();
            }

            return this.queue.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(1));// 1
        System.out.println(counter.ping(100));// 2
        System.out.println(counter.ping(3001));// 3
        System.out.println(counter.ping(3002));// 3
    }
}
