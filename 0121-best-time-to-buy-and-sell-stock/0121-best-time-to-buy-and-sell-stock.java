class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
       int minP=prices[0];
       for(int price:prices){
        minP=Math.min(minP,price);
        profit=Math.max(profit,price-minP);
       }
return profit;
}
}