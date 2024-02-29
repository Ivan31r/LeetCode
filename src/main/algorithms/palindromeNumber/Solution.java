package main.algorithms.palindromeNumber;

public class Solution {
    public static void main(String[] args) {
        int input = 121;
//        int input = -121;
        System.out.println(isPalindromeV2(input));
    }

    public static boolean isPalindromeV1(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int originalNumber = x;
        StringBuilder reversNumber = new StringBuilder(new String());
        while (x > 0) {
            reversNumber.append(x % 10);
            x = x / 10;
        }
        return Integer.parseInt(reversNumber.toString()) == originalNumber;
    }

    public static boolean isPalindromeV2(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int originalNumber = x;
        while (x > 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        return reverse == originalNumber;

    }

}
