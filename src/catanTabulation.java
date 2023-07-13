public class catanTabulation {
    public static int catalan(int n,int dp[])
    {
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        int dp[]=new int[n+1];
        System.out.println(catalan(n,dp));
    }
}
