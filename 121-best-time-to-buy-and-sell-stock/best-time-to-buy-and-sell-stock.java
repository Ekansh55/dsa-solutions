class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];      // best buy so far
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // update min BEFORE selling
            if (prices[i] < min) {
                min = prices[i];
            }

            // try selling on day i
            int currProfit = prices[i] - min;
            if (currProfit > profit) {
                profit = currProfit;
            }
        }

        return profit;
    }
}
