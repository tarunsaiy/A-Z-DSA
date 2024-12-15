/*
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 *
 * LEETCODE: 204
 */

public class CountPrime_SIEVEofEROTHSES {
//    count prime only less than n
   public static void main(String[] args) {
       System.out.println(countPrimes(31));
   }

    static int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;

        boolean[] isPrime = new boolean[n+1];

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (!isPrime[i]){
                for (int j = i*i; j <= n; j+=i){
                    isPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++){
            if (!isPrime[i]) count++;
        }

        return count;
    }
}
