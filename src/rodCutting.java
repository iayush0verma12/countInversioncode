public class rodCutting {
    public static int rodCutMaxValue(int length[],int prices[],int dp[][],int rodLength)
    {
        int n=prices.length;
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            int p=prices[i-1];
            int l=length[i-1];
            for(int j=1;j<length.length+1;j++)
            {

                if(l<=j)
                {
                    int inc = p+dp[i-1][j-l];
                    int ex = dp[i-1][j];
                    int max=Math.max(inc,ex);
                    dp[i][j]=max;
                }
                else {
                    int ex=dp[i-1][j];
                    dp[i][j]=ex;
                }
            }
        }
        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int prices[]={1,5,8,9,10,17,17,20};
        int rodLength=8;
        int dp[][]=new int[prices.length+1][rodLength+1];
        //initialization
        System.out.println(rodCutMaxValue(length,prices,dp,rodLength));
    }
}
