package main.algorithms.angeSumQueryImmutable;

public class Solution {
    public static void main(String[] args) {
        NumArrayV3 v3 = new NumArrayV3(new int[]{-2, 0, 3, -5, 2, -1});  /*[0, -2, -2, 1, -4, -2, 0]*/
        System.out.println(v3.sumRange(0, 2));
        System.out.println(v3.sumRange(2, 5));
        System.out.println(v3.sumRange(0, 5));
        /*[1, -1, -3]*/

        NumArrayV2 v2 = new NumArrayV2(new int[]{-2, 0, 3, -5, 2, -1}); /*[0, -2, -2, 1, -4, -2, -3]*/
        System.out.println(v2.sumRange(0, 2));
        System.out.println(v2.sumRange(2, 5));
        System.out.println(v2.sumRange(0, 5));

    }

}



