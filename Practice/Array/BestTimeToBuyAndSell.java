// 121 https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class BestTimeToBuyAndSell
{
    public static int solution(int [] prices)
    {
        int maxProfit = 0;
        int minBuy = prices[0];
        for(int i = 1; i< prices.length; i++)
        {
            int profit = prices[i] - minBuy;
            maxProfit = Math.max(maxProfit, profit);
            minBuy = Math.min(minBuy, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) 
    {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(solution(prices));
    }
}