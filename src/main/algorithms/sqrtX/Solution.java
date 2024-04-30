package main.algorithms.sqrtX;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrtV4(199));

    }

    public static int mySqrtV1(int x) {
        if (x < 1) return 0;
        for (long i = 1; i < x; i++) {
            if (i * i == x) {
                return (int) i;
            }
            if (i * i > x) {
                return (int) i - 1;
            }
        }

        return 1;
    }

    public static int mySqrtV2(int x) {
        if (x < 1) return 0;
        for (long i = 1; i < x; i++) {
            if (i * i > x) {
                return (int) i - 1;
            }
        }

        return 1;
    }

    public static int mySqrtV3(int x) {
        int left = 0;
        int right = x;
        while (right >= left) {
            long mid = (right + left) / 2;
            if (mid * mid > x) {
                right = (int) mid - 1;
            } else left = (int) mid + 1;
        }
        return left - 1;
    }

    public static int mySqrtV4(int x) {
        int left = 0;
        int right = x / 2 + 2;
        while (left < right) {
            long middle = left + (right - left) / 2;
            if (middle * middle > x) {
                right = (int) middle;
            } else {
                left = (int) middle + 1;
            }
        }
        return left - 1;

    }


}
