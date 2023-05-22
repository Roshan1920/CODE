class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int profit = 0;
        int min = prices[0];
        int max=0;
        
        for(int stockprice:prices)
        {
        min = Math.min(min,stockprice);
        profit = stockprice-min;
        max = Math.max(profit,max);
        }
        return max;
    }
}