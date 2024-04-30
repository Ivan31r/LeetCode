package main.algorithms.validParantheses;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
//        String inputString = "()";
        String inputString = "()[]{}(";
//        String inputString = "(]";
//        String inputString = "[";
//        String inputString = "]";
//        String inputString = "(({}))";
        System.out.println(isValid(inputString));
        System.out.println(isValidV1(inputString));
        System.out.println(isValidV2(inputString));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> parentheses = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );
        Set<Character> openParentheses = Set.of('(', '{', '[');
//        Set<Character> closeParentheses = Set.of(')', '}', ']');
        Stack<Character> inputParentheses = new Stack<>();
        for (int charIndex = 0; charIndex < s.length(); charIndex++) {
            char currentChar = s.charAt(charIndex);
            if (parentheses.get(currentChar) == null) {
                inputParentheses.push(currentChar);
            } else {
                Character popped = inputParentheses.pop();
                if (!openParentheses.contains(popped)) {
                    return false;
                }
            }
        }
        return inputParentheses.empty();
    }

    public static boolean isValidV1(String s) {
        Map<Character, Character> parentheses = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );
        Stack<Character> inputParentheses = new Stack<>();
        for (int charIndex = 0; charIndex < s.length(); charIndex++) {
            char currentChar = s.charAt(charIndex);
            if (!parentheses.containsKey(currentChar)) {
                inputParentheses.push(currentChar);
            } else {
                if (inputParentheses.isEmpty()) return false;
                Character popped = inputParentheses.pop();
                if (parentheses.get(currentChar) != popped) return false;
            }
        }
        return inputParentheses.isEmpty();
    }

    public static boolean isValidV2(String s) {
        Map<Character, Character> parentheses = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );
        Stack<Character> inputParentheses = new Stack<>();

        for (int index = 0; index < s.length(); index++) {
            char currentChar = s.charAt(index);
            if (!parentheses.containsKey(currentChar)) {
                inputParentheses.push(currentChar);
            } else {
                char top = inputParentheses.isEmpty() ? '?' : inputParentheses.pop();
                if (top != parentheses.get(currentChar)) {
                    return false;
                }
            }
        }
        return inputParentheses.isEmpty();
    }

}
