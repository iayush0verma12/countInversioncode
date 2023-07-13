public class WildCardMatch {
    public static boolean Match(String s, String pat)
    {
        int n=s.length();
        int p=pat.length();
        boolean dp[][] = new boolean[n+1][p+1];
        dp[0][0]=true;
        for(int i=1;i<n+1;i++)
        {
            dp[i][0]=false;
        }
        for(int j=1;j<p+1;j++)
        {
            if(pat.charAt(j-1)=='*')
            {
                dp[0][j]=dp[0][j-1];
            }
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<p+1;j++)
            {
                if(s.charAt(i-1)==pat.charAt(j-1)|| pat.charAt(j-1)=='?')
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(pat.charAt(j-1)=='*')
                {
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
                else
                {
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][p];

    }
    public static void main(String[] args) {
        String s="baaabab";
        String pat="*****ba*****ab";
        if(Match(s,pat))
        {
            System.out.print("True");
        }
    }
}
