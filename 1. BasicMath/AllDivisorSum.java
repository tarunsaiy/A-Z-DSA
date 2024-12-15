/*
Given a positive integer n, The task is to find the value of Σi from 1 to n F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

Examples:

Input: n = 4
Output: 15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
So, F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7 = 15

GFG: https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
*/
public class AllDivisorSum {
    public static void main(String[] args) {
        int n = 4;
        int ans = 0;
        for (int i = 0; i < n; i++){
            ans += divisorSum(i + 1);
        }
        System.out.println(ans);
    }
    static int divisorSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0) sum += i;
        }
        return sum;
    }
}
