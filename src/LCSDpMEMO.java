public class LCSDpMEMO {
    public static int LCS(String str1,String str2,int n,int m,int dp[][])
    {

        if(m==0||n==0)
        {
            return 0;
        }

        if(str1.charAt(n-1)==str2.charAt(m-1))
        {
            dp[n][m]=LCS(str1,str2,n-1,m-1,dp)+1;
            return dp[n][m];
        }
        else{
            int ans1=LCS(str1,str2,n-1,m,dp);
            int ans2=LCS(str1,str2,n,m-1,dp);
            dp[n][m]=Math.max(ans1,ans2);

            return dp[n][m];
        }
    }
    public static void main(String[] args) {
        String str1="abcdi3e";
        String str2="abcdi3g";
        int dp[][]= new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(LCS(str1,str2,str1.length(),str2.length(),dp));
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }

    }
}
