package medium;

import java.util.Arrays;

public class BuySellStock2 {

    public static int maxProfit(int[] prices) {

        if(prices.length == 0) return 0;

        int maxProfit = 0;
        int buy = prices[0];
        boolean hasBuy = false;

        for(int i = 1; i < prices.length; i++) {

            int price = prices[i];

            if(price >= prices[i - 1]) {

                if(!hasBuy) {

                    buy = prices[i - 1];
                    hasBuy = true;
                }

                if(i == prices.length - 1) maxProfit += getProfit(price, buy);
            }
            else if(price < prices[i - 1] && hasBuy) {

                maxProfit += getProfit(prices[i - 1], buy);
                hasBuy = false;
            }
        }

        return maxProfit;
    }

    public static int getProfit(int i, int j) {

        try {
            return Math.subtractExact(i, j);
        }
        catch(ArithmeticException e) { throw new ArithmeticException(
                "exception from " + i + " - " + j + " due to integer overflow"); }
    }

    public static void main(String[] args) {

        System.out.println("122. Best Time to Buy and Sell Stock II");

        // example 1
        int[] a1 = {7, 1, 5, 3, 6, 4, 5};
        System.out.println("\nArray: " + Arrays.toString(a1));
        System.out.println("Max Profit: " + maxProfit(a1));

        // example 2
        int[] a2 = {1, 9, 9};
        System.out.println("\nArray: " + Arrays.toString(a2));
        System.out.println("Max Profit: " + maxProfit(a2));

        // example 3
        int[] a3 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        System.out.println("\nArray: " + Arrays.toString(a3));
        System.out.println("Max Profit: " + maxProfit(a3));
    }
}
