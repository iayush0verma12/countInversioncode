public class EditDistance {
    public static int Edit(String str1,String str2,int n,int m)
    {

        int dp[][]= new int[n+1][m+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0)
                {
                    dp[i][j]=j;
                }
                if(j==0)
                {
                    dp[i][j]=i;
                }
            }
        }

        for(int i=1;i<str1.length()+1;i++)
        {
            for(int j=1;j<str2.length()+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))//comparing the last character
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else {
                    int add=dp[i][j-1]+1;
                    int del=dp[i-1][j]+1;
                    int rep=dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(add,Math.min(del,rep));
                }
            }
        }
        return dp[n][m];

    }

    public static void main(String[] args) {
        String str1="intention";
        String str2="execution";


//        System.out.println(LCSTab(str1,str2,str1.length(),str2.length(),dp));
        System.out.println(Edit(str1,str2,str1.length(),str2.length()));
    }
}
