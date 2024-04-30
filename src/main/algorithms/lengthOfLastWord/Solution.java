package main.algorithms.lengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        String s = "luffy is    still joyboy";
//        String s = "a";
        System.out.println(lengthOfLastWordV4(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] split = s.split("\\s");
        String lastString = split[split.length - 1];
        return lastString.length();
    }

    public static int lengthOfLastWordV2(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        return length;
    }

    public static int lengthOfLastWordV3(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            } else if (s.charAt(i) == ' ' && count != 0) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }

    public static int lengthOfLastWordV4(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count != 0) {
                return count;
            } else if (s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}
