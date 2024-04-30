package main.algorithms.bestTimeToBuyAndSellStock;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }

//    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        int currentProfit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = 0; j < prices.length - 1; j++) {
//                currentProfit = prices[j + 1] - prices[j];
//                maxProfit = Math.max(currentProfit, maxProfit);
//            }
//        }
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }

        return maxProfit;
    }
}
