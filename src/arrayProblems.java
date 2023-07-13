public class arrayProblems {
    /*public static boolean checkDistinct(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]==numbers[j])
                {
                    return true;
                }
            }
        }
        return false;
    }*/


    //QUestion number 2
    /*public static int maxProfit(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else
            {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }*/
    /*public static int TrapWater(int height[])
    {
        //calculate left and right boundary
        //run a loop for water
        //calculate trapped water
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }*/

    public static void printTriples(int nums[])
    {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0)
                    {
                        System.out.println("["+i+","+j+","+k+"]");
                    }
                }
            }
        }
    }


    public static void main(String args[])
    {
        //Question one
        /*int numbers[]={1,2,4,3,5,6,7};*/
       /* System.out.println(checkDistinct(numbers));*/

        //Question number2
        /*int prices[]={1,2,3,4,5,6};
        System.out.println("Maximum Profit is "+maxProfit(prices));*/

        //Question number 3
        /*int height[]={0,1,0,2,1,0,1,3,2,2,1,2};
        System.out.println("Maximum Trapped Water is "+TrapWater(height));*/

        //Question numbers 4
        int nums[]={-1, 0,  1, 2, -1, -4};
        printTriples(nums);
    }
}