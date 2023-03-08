/**
 * author:sj
 */

package day11;

import java.util.PriorityQueue;

public class No1 {
    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.nthSuperUglyNumber(12,new int[]{2,7,13,19});
    }
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        while (n-- > 0) {
            int x = q.poll();
            if (n == 0){
                return x;
            }
            for (int k : primes) {
                if (k <= Integer.MAX_VALUE / x){
                    q.add(k * x);
                }
                if (x % k == 0){
                    break;
                }
            }
        }
        return -1; // never
    }
}
