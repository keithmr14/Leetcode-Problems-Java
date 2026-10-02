package easy;

import java.util.Arrays;

public class BuySellStock {

    public static int maxProfit(int[] prices) {

        if(prices.length == 0) return 0;

        int maxProfit = 0;
        int cheapest = prices[0];

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] > cheapest) try {
                int diff = Math.subtractExact(prices[i], cheapest);
                maxProfit = Math.max(maxProfit, diff);
            }
            catch(ArithmeticException e) { throw new ArithmeticException(
                    "exception from " + prices[i] + " - " + cheapest + " due to integer overflow"); }

            cheapest = Math.min(cheapest, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        System.out.println("121. Best Time to Buy and Sell Stock");

        // example 1
        int[] a1 = {7, 1, 5, 3, 6, 4};
        System.out.println("\nArray: " + Arrays.toString(a1));
        System.out.println("Max Profit: " + maxProfit(a1));

        // example 2
        int[] a2 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        System.out.println("\nArray: " + Arrays.toString(a2));
        System.out.println("Max Profit: " + maxProfit(a2));
    }
}
