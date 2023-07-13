public class   Stock {
   /* public static int buyAndSellStock(int prices[])
    {
        int buyPrice= Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;
                MaxProfit=Math.max(profit,MaxProfit);
            }
            else
            {
                buyPrice=prices[i];
            }
        }
        return MaxProfit;

    }*/
    public static int buyAndSellStock(int prices[])
    {
        int buyPrice =Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;
                MaxProfit=Math.max(profit,MaxProfit);
            }
            else
            {
                buyPrice=prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String args[])
    {
        int prices[]={2,3,4,5,6,7,6,19};
        System.out.println("Maximum profit is "+buyAndSellStock(prices));
    }
}