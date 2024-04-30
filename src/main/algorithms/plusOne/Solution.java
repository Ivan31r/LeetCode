package main.algorithms.plusOne;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] digits = {4, 3, 2, 1, 9};
        int[] digits = {9, 9, 9, 9, 9};
//        int[] digits = {9};
        System.out.println(Arrays.toString(plusOneV2(digits)));
    }


    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        while (digits[lastIndex] == 9) {
            digits[lastIndex] = 0;
            lastIndex--;

            if (lastIndex < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (lastIndex >= 0) {
            digits[lastIndex]++;
        }
        return digits;
    }

    public static int[] plusOneV2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
