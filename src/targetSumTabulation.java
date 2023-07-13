public class targetSumTabulation {
    public static boolean TargetExists(int number[], int TS, boolean[][] dp)
    {
        int n=number.length;
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++)
        {
            int nb=number[i-1];
            for(int j=1;j<TS+1;j++)
            {
                if(nb<=j && dp[i-1][j-nb]==true)
                {
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true)
                {
                    dp[i][j]=true;
                }
//                else
//                {
//                    dp[i][j]=false;
//                }
            }

        }

        for(int i=0;i< dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[n][TS];
    }
    public static void main(String[] args) {
        int number[]={4,2,7,1,3};
        int TargetSum=10;
        boolean [][]dp= new boolean[number.length+1][TargetSum+1];
        if(TargetExists(number,TargetSum,dp))
        {
            System.out.println("yes! This Target exists! ");
        }
        else {
            System.out.println("No ! Not at all , This target doesnt exists!");
        }
    }
}
