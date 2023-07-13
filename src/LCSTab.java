public class LCSTab {
    public static int LCSTab(String str1,String str2,int n,int m,int dp[][])
    {


//        if(m==0||n==0)
//        {
//            return 0;
//        }
//
//        if(str1.charAt(n-1)==str2.charAt(m-1))
//        {
//            dp[n][m]=LCSTab(str1,str2,n-1,m-1,dp)+1;
//            return dp[n][m];
//        }
//        else{
//            int ans1=LCSTab(str1,str2,n-1,m,dp);
//            int ans2=LCSTab(str1,str2,n,m-1,dp);
//            dp[n][m]=Math.max(ans1,ans2);
//            return dp[n][m];
//        }

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

    public static int LCSCont(String str1,String str2,int n,int m,int dp[][])
    {

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
        int ans=0;
        //abcdw //abcde
        for(int i=1;i<str1.length()+1;i++)
        {
            for(int j=1;j<str2.length()+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))//comparing the last character
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans,dp[i][j]);
                }
                else {
                    dp[i][j]=0; //agr tum yahan pe previous ko call kroge to ye na previous long ka data to store krega like pehle
                    //3 length ka ek string tha ar ab na yahan pe 15 length ka longest substring hai to ab ye karna hai ki jab bhi jis length
                    //pe tum kaam kar rhe uss length pe try karna ki 0 store kar lo agar last value same nai hai.
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String str1="abcdwqwertyuiopmmaaa";
        String str2="abcdwqwertyuiopiiaaa";
        int dp[][]= new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
//        System.out.println(LCSTab(str1,str2,str1.length(),str2.length(),dp));
        System.out.println(LCSCont(str1,str2,str1.length(),str2.length(),dp));
    }
}
