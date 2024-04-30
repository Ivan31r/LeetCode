package main.algorithms.addBinary;

public class Solution {
    public static void main(String[] args) {
//        String a = "11";
//        String b = "1";
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (aLength >= 0 || bLength >= 0) {
            int sum = carry;
            if (aLength >= 0) {
                sum += a.charAt(aLength) - '0';
            }
            if (bLength >= 0) {
                sum += b.charAt(bLength) - '0';
            }
            result.append(sum % 2);
            carry = sum / 2;
            aLength--;
            bLength--;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public static String addBinaryV2(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            stringBuilder.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;


        }
        if (carry != 0) stringBuilder.append(carry);
        return stringBuilder.reverse().toString();

    }
}
