package main.algorithms.pascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int numRows = 3;
        List<Integer> generate = getRow(numRows);
        List<Integer> generateV2 = getRowV2(numRows);
        System.out.println(generate);
        System.out.println(generateV2);
    }

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> first = new ArrayList<>() {{
            add(1);
        }};
        if (rowIndex == 0) return first;
        List<List<Integer>> resultList = new ArrayList<>();

        resultList.add(first);
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> previousLine = resultList.get(i - 1);
            ArrayList<Integer> currentLine = new ArrayList<>();
            currentLine.add(1);
            for (int j = 1; j < i; j++) {
                currentLine.add(previousLine.get(j - 1) + previousLine.get(j));
            }
            currentLine.add(1);
            resultList.add(currentLine);
        }
        return resultList.get(rowIndex);
    }

    public static List<Integer> getRowV2(int rowIndex) {        //The row's first element is always 1. Given the previous element in the row (prev), the next element can be calculated using:
        List<Integer> res = new ArrayList<>();                  //next_val = prev × (rowIndex−k+1) / k
        res.add(1);                                             //This formula is derived from the relationship between consecutive binomial coefficients in the same row.
        long prev = 1;                                          //Iterating from k = 1 to k = rowIndex, we can directly generate the elements for the desired row without building the entire triangle
        for (int k = 1; k <= rowIndex; k++) {                   // it's binomial coefficient.
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}
