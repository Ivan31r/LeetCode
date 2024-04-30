package main.algorithms.SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
    Tinkoff task
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 11, 20, 21, 22};
//        int[] arr = {0, 1, 2, 4, 5, 7};
//        List<String> summaryRanges = summaryRanges(arr);
//        List<String> summaryRangesV2 = summaryRangesV2(arr);
//        String summaryRangesV3 = summaryRangesV3(arr);
//        String ranges = ranges(arr);
        System.out.println(rangeDigitsMaxim(arr));
//        System.out.println(summaryRangesV2);
//        System.out.println(summaryRangesV3);
//        System.out.println(ranges);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) return ranges;
        StringBuilder builder = new StringBuilder();
        int first = nums[0];
        int currentIndex = 0;
        while (currentIndex < nums.length) {
            if (currentIndex == nums.length - 1) {
                builder.append(first);
                if (first != nums[currentIndex]) {
                    builder.append("->");
                    builder.append(nums[currentIndex]);
                }
                ranges.add(builder.toString());
                break;
            }
            if (nums[currentIndex + 1] - nums[currentIndex] == 1) {
                currentIndex++;
                continue;
            }
            builder.append(first);
            if (first == nums[currentIndex]) {
                ranges.add(builder.toString());
                builder.setLength(0);
                first = nums[++currentIndex];
                continue;
            }
            builder.append("->");
            builder.append(nums[currentIndex]);
            ranges.add(builder.toString());
            builder.setLength(0);
            first = nums[++currentIndex];
        }
        return ranges;
    }

    public static List<String> summaryRangesV2(int[] nums) {
        List<String> list = new ArrayList();
        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (a != nums[i]) {
                list.add(a + "->" + nums[i]);
            } else {
                list.add(a + "");
            }
        }
        return list;
    }

    public static String summaryRangesV3(int[] nums) {
        StringBuilder builder = new StringBuilder();
        if (nums.length == 1) {
            builder.append((nums[0] + ""));
            return builder.toString();
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (a != nums[i]) {
                builder.append((a + "-> " + nums[i]));
                builder.append(", ");
            } else {
                builder.append(a + "");
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    public static String ranges(int[] nums) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < nums.length; index++) {
            int first = nums[index];
            while (index + 1 < nums.length && (nums[index + 1] - nums[index] == 1)) {
                index++;
            }
            if (first != nums[index]) {
                builder.append(first);
                builder.append("->");
                builder.append(nums[index]);
                if (index != nums.length - 1) {
                    builder.append(", ");
                }
            } else {
                builder.append(first);
                builder.append(", ");
            }

        }
        return builder.toString();
    }

    public static String rangeDigitsMaxim(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Arr is empty");
        }

        int step = 0;
        int start = 0;
        String result = "";
        while (step < arr.length) {
            if ((step + 1 == arr.length) || (Math.abs(arr[step + 1] - arr[step]) > 1)) {
                if (start != step) {
                    result += (result.length() > 1 ? "," : "") + String.valueOf(arr[start]) + "-" + String.valueOf(arr[step]);
                }
                start = step + 1;
            }
            step++;
        }
        return result;
    }
}
