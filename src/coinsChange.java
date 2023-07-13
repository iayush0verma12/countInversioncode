import java.util.Arrays;

public class coinsChange {
    public static int NoOfWays(int coins[],int sum,int dp[][])
    {
        int n=coins.length;
        for(int i=0;i<n+1;i++)
        {
           dp[i][0]=1;
        }
        for(int j=0;j<sum+1;j++)
        {
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            if(dp[i][coins.length]!=-1)
            {
                return dp[i][coins.length];
            }
            int c=coins[i-1];
            for(int j=1;j<sum+1;j++)
            {
                if(c<=j)
                {
                    dp[i][j]= dp[i][j-c]+dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }


        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][sum];

    }
    public static void main(String[] args) {
       int  coins[]={2,5,3,6};
       int sum=10;
       int dp[][]=new int[coins.length+1][sum+1];
       for(int i=0;i<dp.length;i++)
       {
           for(int j=0;j<dp[0].length;j++)
           {
               dp[i][j]=-1;
           }
       }
        System.out.println(NoOfWays(coins,sum,dp));
    }
}
