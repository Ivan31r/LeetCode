package main.algorithms.climbingStairs;

public class Solution {
    public static void main(String[] args) {
        int income = 5;
        System.out.println(climbStairs(income));
    }

    public static int climbStairs(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static int climbStairsV2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairsV2(n - 1) + climbStairsV2(n - 2);

    }

    public static int climbStairsV3(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int k = 3; k <= n; k++) {
            dp[k] = dp[k - 1] + dp[k - 2];
        }

        return dp[n];
    }

    /*
    7 6 5
      5 4 3
        4 3 2
          3 2 1
            2 1 0
              1 0

     */


}
