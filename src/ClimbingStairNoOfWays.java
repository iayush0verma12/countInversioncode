import java.util.*;

public class ClimbingStairNoOfWays {
//    public static int ClimbingStairNoOfWays(int n,int dp[])
//    {
//        if(n==0||n==1||n==2||n==3)
//        {
//            return n;
//        }
//        if(dp[n]!=0)
//        {
//            return dp[n];
//        }
//        dp[n] = ClimbingStairNoOfWays(n-1,dp)+ClimbingStairNoOfWays(n-2,dp);
//        return dp[n];
//    }
    public static int NoOfWays2(int n, int[] dp)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }

        dp[n]=NoOfWays2(n-1,dp)+NoOfWays2(n-2,dp);
        return dp[n];
    }
//    public static int NoOfWaysTabulation(int n, int dp[])
//    {
//
//    }


    public static void main(String[] args) {
        int n=5;
        int[] dp =new int[n+1];
        Arrays.fill(dp,-1);
//        System.out.println(ClimbingStairNoOfWays(n,dp));
        System.out.println(NoOfWays2(n,dp));
//        System.out.println(NoOfWaysTabulation(n,dp));
//        dp[0]=0;
//        dp[1]=1;
//        dp[2]=2;
//        for(int i=3;i<=n;i++)
//        {
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        System.out.println(dp[n]);
    }
}