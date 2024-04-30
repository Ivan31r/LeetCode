package main.algorithms.findTheIndexOfTheFirstOccurenceInAString;

public class Solution {
    public static void main(String[] args) {
        String haystack = "leetcode";
//        String haystack = "sadbutsad";
        String needle = "leeto";
//        String needle = "sad";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }
}
