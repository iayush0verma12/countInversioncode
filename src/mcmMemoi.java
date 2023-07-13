public class mcmMemoi {
    public static int mcm(int arr[],int si,int ei,int dp[][])
    {
        int k=0;
        if(si==ei)
        {
            return 0;
        }
        if(dp[si][ei]!=-1)
        {
            return dp[si][ei];
        }
        int ans=Integer.MAX_VALUE;
        for(k=si;k<=ei-1;k++)
        {
            int cost1=mcm(arr,si,k,dp);
            int cost2=mcm(arr,k+1,ei,dp);
            int cost3=arr[si-1]*arr[k]*arr[ei];
            int finalcost=cost1+cost2+cost3;
            ans= Math.min(ans,finalcost);
            dp[si][ei]=ans;
        }
        return dp[si][ei];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=5;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(mcm(arr,1,arr.length-1,dp));
    }
}
