class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];

        int n = prices.length;

        int profit = 0;

        for (int i = 1; i < n; i++) { // Start at index 1 as buying and selling on day 0 is not allowed

            // Calculate the potential profit if we sell on day i
            int cost = prices[i] - minimum;

            // Update the maximum profit if this potential profit is greater
            profit = Math.max(profit, cost);

            minimum = Math.min(prices[i], minimum); // checks is i-1 elemnrt is small or the minimum is small
        }

        return profit;
    }
}
