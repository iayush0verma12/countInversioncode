public class StringConvertion {
    public static int Convert(String str1,String str2,int n,int m)
    {

        int dp[][]= new int[n+1][m+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<str1.length()+1;i++)
        {
            for(int j=1;j<str2.length()+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))//comparing the last character
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    int max=Math.max(ans1,ans2);
                    dp[i][j]=max;
                }
            }
        }
        return dp[n][m];

    }

    public static void main(String[] args) {
        String str1="abcdef";
        String str2="aceg";


        System.out.println(Convert(str1,str2,str1.length(),str2.length()));
        int del=str1.length()-Convert(str1,str2,str1.length(),str2.length());
        int add=str2.length()-Convert(str1,str2,str1.length(),str2.length());
        System.out.println(del+add);
    }
}
