package main.algorithms.pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> generate = generate(numRows);
        List<List<Integer>> generatev2 = generatev2(numRows);
        System.out.println(generate);
        System.out.println(generatev2);

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (numRows == 0) return resultList;
        ArrayList<Integer> first = new ArrayList<>() {{
            add(1);
        }};
        resultList.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousLine = resultList.get(i - 1);
            ArrayList<Integer> currentLine = new ArrayList<>();
            currentLine.add(1);
            for (int j = 1; j < i; j++) {
                currentLine.add(previousLine.get(j - 1) + previousLine.get(j));
            }
            currentLine.add(1);
            resultList.add(currentLine);
        }
        return resultList;
    }

    public static List<List<Integer>> generatev2(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (numRows == 0) return resultList;
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        resultList.add(first);
        if (numRows == 1) return resultList;
        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        resultList.add(second);
        for (int i = 2; i < numRows; i++) {
            List<Integer> previousLine = resultList.get(i - 1);
            ArrayList<Integer> currentLine = new ArrayList<>();
            currentLine.add(1);
            for (int j = 1; j < i; j++) {
                currentLine.add(previousLine.get(j - 1) + previousLine.get(j));
            }
            currentLine.add(1);
            resultList.add(currentLine);
        }
        return resultList;
    }
}
