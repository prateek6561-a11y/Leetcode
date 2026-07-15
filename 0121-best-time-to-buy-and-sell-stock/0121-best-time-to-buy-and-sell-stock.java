class Solution {
    public int maxProfit(int[] prices) {
       int minP=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minP) minP=prices[i];
         else profit=Math.max(profit,prices[i]-minP);
    }
    return profit;
}
}