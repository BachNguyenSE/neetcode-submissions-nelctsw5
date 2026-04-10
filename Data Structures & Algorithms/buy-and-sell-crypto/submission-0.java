class Solution {
    public int maxProfit(int[] prices) {
        int bestprice = 0;
        if (prices.length == 0) {
            return 0;
        }else {
            for (int i = 0; i < prices.length - 1; i++) {
                for (int j = i + 1; j < prices.length ; j++) {
                    if(prices[j] - prices[i] > bestprice && prices[j] - prices[i] > 0){
                        bestprice = prices[j] - prices[i];
                    }
                }
            }
        }

        return bestprice;
    }
}
