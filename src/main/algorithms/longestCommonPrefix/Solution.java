package main.algorithms.longestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] strings = {
                "flower",
                "flow",
                "flight"
        };
//        String[] strings = {
//                "dog",
//                "racecar",
//                "car"
//        };
//        String[] strings = {""};
        System.out.println(longestCommonPrefixV2(strings));
    }


    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    /*
    ?
    */
    public static String longestCommonPrefixV2(String[] strs) {
        String commonPrefix = "";
        if (strs.length == 0) return commonPrefix;
        for (int index = 0; index < strs[0].length(); index++) {
            for (int charIndex = 0; charIndex < strs[index].length(); charIndex++) {
                if (index == strs[index].length() || (strs[index].charAt(charIndex) != strs[0].charAt(charIndex))) {
                    return commonPrefix;
                }
            }
            commonPrefix += strs[0].charAt(index);
        }

        return commonPrefix;
    }

    public static String longestCommonPrefixV3(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int index = 0; index < first.length; index++) {
            if (first[index] != last[index]) {
                break;
            }
            stringBuilder.append(first[index]);
        }
        return stringBuilder.toString();
    }

}
