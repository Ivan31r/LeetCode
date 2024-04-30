package main.algorithms.powerOfTwo;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n == 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    public static boolean isPowerOfTwoV2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
