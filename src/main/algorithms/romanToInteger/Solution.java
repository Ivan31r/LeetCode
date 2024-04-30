package main.algorithms.romanToInteger;

import java.util.Map;
import java.util.Set;

public class Solution {
    public static final Map<Character, Integer> CHARACTER_INTEGER_MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );
    public static final Set<Character> COMPLEX_CHAR = Set.of(
            'I',
            'X',
            'C'
    );

    public static void main(String[] args) {
        String romanValue = "MCMXCIV";
        System.out.println(romanToIntV4(romanValue));
    }

    public static int romanToIntV1(String s) {

        int integerValue = 0;
        int skipIndex = 0;
        for (int index = 0; index < s.length(); index++) {
            if (skipIndex != 0 && skipIndex == index) continue;
            char c = s.charAt(index);
            if (c == 'I') {
                if (s.charAt(index + 1) == 'V' || s.charAt(index + 1) == 'X') {
                    integerValue += CHARACTER_INTEGER_MAP.get(s.charAt(index + 1)) - CHARACTER_INTEGER_MAP.get(c);
                    skipIndex = index + 1;
                } else {
                    integerValue += CHARACTER_INTEGER_MAP.get(c);
                }
            } else if (c == 'X') {
                if (s.charAt(index + 1) == 'L' || s.charAt(index + 1) == 'C') {
                    integerValue += CHARACTER_INTEGER_MAP.get(s.charAt(index + 1)) - CHARACTER_INTEGER_MAP.get(c);
                    skipIndex = index + 1;
                } else {
                    integerValue += CHARACTER_INTEGER_MAP.get(c);
                }
            } else if (c == 'C') {
                if (s.charAt(index + 1) == 'D' || s.charAt(index + 1) == 'M') {
                    integerValue += CHARACTER_INTEGER_MAP.get(s.charAt(index + 1)) - CHARACTER_INTEGER_MAP.get(c);
                    skipIndex = index + 1;
                } else {
                    integerValue += CHARACTER_INTEGER_MAP.get(c);
                }
            } else {
                integerValue += CHARACTER_INTEGER_MAP.get(c);
            }
        }
        return integerValue;
    }

    public static int romanToIntV2(String s) {
        int stringLength = s.length() - 1;
        int integerValue = 0;
        int skipIndex = -1;
        for (int index = 0; index < stringLength; index++) {
            if (index == skipIndex) {
                continue;
            }
            char currentChar = s.charAt(index);
            char nextChar = s.charAt(index + 1);
            if (COMPLEX_CHAR.contains(currentChar) && (CHARACTER_INTEGER_MAP.get(nextChar) > CHARACTER_INTEGER_MAP.get(currentChar))) {
                integerValue += CHARACTER_INTEGER_MAP.get(nextChar) - CHARACTER_INTEGER_MAP.get(currentChar);
                skipIndex = index + 1;
            } else {
                integerValue += CHARACTER_INTEGER_MAP.get(currentChar);
            }

        }
        if (skipIndex != stringLength) {
            integerValue += CHARACTER_INTEGER_MAP.get(s.charAt(stringLength));
        }
        return integerValue;
    }

    public static int romanToIntV3(String s) {
        int integerValue = 0;
        int skipIndex = -1;
        for (int index = 0; index < s.length() - 1; index++) {
            if (index == skipIndex) {
                continue;
            }
            char currentChar = s.charAt(index);
            if ((CHARACTER_INTEGER_MAP.get(s.charAt(index + 1)) > CHARACTER_INTEGER_MAP.get(currentChar))) {
                integerValue += CHARACTER_INTEGER_MAP.get(s.charAt(index + 1)) - CHARACTER_INTEGER_MAP.get(currentChar);
                skipIndex = index + 1;
            } else {
                integerValue += CHARACTER_INTEGER_MAP.get(currentChar);
            }

        }
        if (skipIndex != s.length() - 1) {
            integerValue += CHARACTER_INTEGER_MAP.get(s.charAt(s.length() - 1));
        }
        return integerValue;
    }

    public static int romanToIntV4(String s) {
        int integerNumber = 0;
        for (int index = 0; index < s.length(); index++) {
            if (index + 1 < s.length() - 1 && CHARACTER_INTEGER_MAP.get(s.charAt(index + 1)) > CHARACTER_INTEGER_MAP.get(s.charAt(index))) {
                integerNumber -= CHARACTER_INTEGER_MAP.get(s.charAt(index));
            } else {
                integerNumber += CHARACTER_INTEGER_MAP.get(s.charAt(index));
            }
        }
        return integerNumber;
    }


}
