package main.algorithms.validPalindrome;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "0P";
        System.out.println(isPalindromeV2(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < s.length(); index++) {
            char currentChar = s.charAt(index);
            if (Character.isLetterOrDigit(currentChar)) {
                builder.append(Character.toLowerCase(currentChar));
            }
        }
        return builder.toString().contentEquals(builder.reverse());
    }

    public static boolean isPalindromeV2(String s) {
        StringBuilder originalString = new StringBuilder();
        StringBuilder reversedSting = new StringBuilder();
        int left = 0;
        int right = s.length() - 1;
        int index = 0;
        while (true) {
            if (Character.isLetterOrDigit(s.charAt(index))) {
                originalString.append(Character.toLowerCase(s.charAt(left)));
            }
            left++;
            if (Character.isLetterOrDigit(s.charAt(right))) {
                reversedSting.append(Character.toLowerCase(s.charAt(right)));
            }
            right--;
            index++;
            if (index == s.length()) {
                break;
            }
        }
        return originalString.compareTo(reversedSting) == 0;
    }
}
